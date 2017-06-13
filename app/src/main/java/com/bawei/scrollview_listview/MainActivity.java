package com.bawei.scrollview_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            list.add("条目" + i);
        }
        MyAdapter adapter = new MyAdapter(this, list);


        listView.setAdapter(adapter);
        Utility utility = new Utility();
        utility.setListViewHeightBasedOnChildren(listView  );
    }
}
