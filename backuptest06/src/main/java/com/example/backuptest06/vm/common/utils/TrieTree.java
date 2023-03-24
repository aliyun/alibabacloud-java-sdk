package com.example.backuptest06.vm.common.utils;

import com.example.backuptest06.vm.common.entity.TrieNode;
import org.omg.IOP.Encoding;


import java.util.HashMap;

/**
 * @author
 * @Description
 * @time 2022110321:38
 */
public class TrieTree {
    TrieNode root =new TrieNode(null);
    public void insertKeyword(String keyword,String content){

        TrieNode cur = root;
        char c;
        int length = keyword.length();

        String contentTopSixBytes =new String(content);
//        System.out.println("contentTopSixBytes"+contentTopSixBytes);
        for (int i = 0; i < length; i++) {
            c = keyword.charAt(i);
            if (!cur.getSon().containsKey(c)) {
                cur.getSon().put(c, new TrieNode(c));
            }
            cur = cur.getSon().get(c);
        }
        //循环走完后，cur指向该keyword最后一个字符，

        cur.setTail(true);
//        System.out.println("content:"+content+",tail:"+cur.isTail());
        //该节点已经存有内容
        cur.setContent(contentTopSixBytes);

    }



}
