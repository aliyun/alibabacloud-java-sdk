package com.example.backuptest06.vm.common.utils;
import com.example.backuptest06.vm.common.entity.ModifiedFragmentInfo;
import com.example.backuptest06.vm.common.entity.TrieNode;
import com.example.backuptest06.vm.common.entity.UnchangedFragment;
import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Adler32;

/**
 * @author
 * @Description
 * @time 2022111113:59
 */
public class IncreBackup {
    String algorithm = "MD5";
    private static final int BYTE_SIZE = 12;

    public TrieTree Hash2TrieTree(File file) throws NoSuchAlgorithmException, IOException {
        TrieTree tree = new TrieTree();

        InputStream ins = null;
        ins = new FileInputStream(file);
        long size = file.length();

        String path = file.getPath();
        FileInputStream in = new FileInputStream(path);
        byte[] digested = null;

        MessageDigest digest = MessageDigest.getInstance(algorithm);
        RandomAccessFile randRFile = new RandomAccessFile(file, "r");
        byte[] bytes = new byte[BYTE_SIZE];
//        System.out.println(size / BYTE_SIZE);

//        // 读入多个字节到字节数组中，byteread为一次读入的字节数
//        FileOutputStream fos = new FileOutputStream(newPath);
//        System.out.println(" Hash2TrieTree---size:"+size);
        int i;
        for (i = 0; i <= size / BYTE_SIZE; i++) {
            //bytes数组清零
            java.util.Arrays.fill(bytes, (byte) 0);
            randRFile.seek(i * BYTE_SIZE);
            if ((int) size - i * BYTE_SIZE >= BYTE_SIZE)
                randRFile.read(bytes, 0, BYTE_SIZE);
            else
                randRFile.read(bytes, 0, (int) size - i * BYTE_SIZE);
            digest.update(bytes);
            //完成哈希摘要计算并返回特征值
            digested = digest.digest();
            String cacheKey;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < digested.length; j++) {
                String hex = Integer.toHexString(0xFF & digested[j]);//进制转化
                if (hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
            cacheKey = sb.toString();
//            fos.write(cacheKey.getBytes());
//            fos.write("\n".getBytes());
//            System.out.println(cacheKey);
            //取前六位
            String cacheKeyTop6Bytes = cacheKey.substring(0, 6);
            tree.insertKeyword(cacheKeyTop6Bytes, new String(bytes));
        }

        return tree;
    }




    public String search(File oldFile,TrieTree tree, File newFile) throws NoSuchAlgorithmException, IOException {
        HashMap<String, Integer> result = new HashMap<>();
        byte[] digested = null;
        TrieNode cur = tree.root;
        long size = newFile.length();

        MessageDigest digest = MessageDigest.getInstance(algorithm);

        RandomAccessFile randRFile = new RandomAccessFile(newFile, "r");

        byte[] bytes = new byte[BYTE_SIZE];
//        System.out.println(size / BYTE_SIZE);

        long currentIndex = 0;
        List<UnchangedFragment> unchangedFragment = new ArrayList<>();
        List<ModifiedFragmentInfo> modifiedFragments = new ArrayList<>();
        List<Long> unchangedFragmentInsertIndex = new ArrayList<>();
        boolean isModified = false;
        boolean isStartIndexUsed = false;
        long startIndex = 0;
        int i=0;
        int nlen;
        String newStr = "";
        boolean isContainsKey = true;

        while((nlen = randRFile.read(bytes)) != -1){
            digest.update(bytes);
            //完成哈希摘要计算并返回特征值
            digested = digest.digest();
            String cacheKey;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < digested.length; j++) {
                String hex = Integer.toHexString(0xFF & digested[j]);//进制转化
                if (hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
            cacheKey = sb.toString();

            //取前六位
            String cacheKeyTop6Bytes = cacheKey.substring(0, 6);

            int start = 0, end = 0;
            long len = 12;
            isContainsKey = true;
            System.out.println("new String(bytes):"+new String(bytes));
            while ( isContainsKey) {
                //如果end没到头，并且在cur.HashMap里找到了document[end]节点
                if (end < len && cur.son.containsKey(sb.charAt(end))) {
                    //cur指向子节点，end向后移
                    cur = cur.son.get(sb.charAt(end));
                    end++;
                    //如果cur是某keyword的最后一个字符节点，就统计该keyword的频率
                    if (cur.isTail()) {
                          if ((cur.getContent().contains(new String(bytes)))) {
//                              System.out.println("new String(bytes):"+new String(bytes));
                            //改动后第一块未改的
                            if(isModified){
//                                System.out.println("startIndex:"+startIndex);
                                modifiedFragments.add(new ModifiedFragmentInfo(startIndex, currentIndex - startIndex-1));
                                isModified = false;
//                                System.out.println("startIndex:"+startIndex+",length:"+(currentIndex - startIndex));
                            }
                            //未改动块的处理
                            unchangedFragment.add(new UnchangedFragment(currentIndex,BYTE_SIZE));
                            currentIndex +=12;
                            randRFile.seek(currentIndex);
                            cur = tree.root;
                           break;
                        }

                    }
                }
                else{
                        //叶子节点的内容不同，说明是增量内容
                        //文件块发生改动
                        if (!isModified) {
                            isModified = true;
                            startIndex = currentIndex;

                        }
                    isContainsKey = false;
                }
            }
            if(isContainsKey){
//                System.out.println("success:"+new String(bytes));
            }
            else
            {
                //最后一块不匹配，被改了
                if(currentIndex+len>=size){
                    if(startIndex == 0)
                        modifiedFragments.add(new ModifiedFragmentInfo(startIndex, size));
                    else
                        modifiedFragments.add(new ModifiedFragmentInfo(currentIndex, len));
                }
                else{
                    currentIndex+=1;
                    randRFile.seek(currentIndex);
                    cur = tree.root;
                }

            }
            //bytes数组清零
            java.util.Arrays.fill(bytes, (byte) 0);
        }
        //恢复
        incrementalRecovery(modifiedFragments,unchangedFragment,oldFile,newFile);

       return newStr;

    }
    public void incrementalRecovery (List<ModifiedFragmentInfo> modifiedFragments,List<UnchangedFragment> unchangedFragment,File oldFile,File newFile) throws IOException {
        String recoveryFilePath = "D:\\Graduate's\\HuaWei_balabala\\recovery.docx";
        File file = new File(recoveryFilePath);
        FileWriter fw = null;
        //如果文件中有内容，则清空文件
        if (file.exists()) {
            fw = new FileWriter(file);
            fw.write("");
            fw.flush();
        }
        RandomAccessFile incrementalFile = null;
        incrementalFile = new RandomAccessFile(recoveryFilePath, "rw");


//        //只存储增量部分
//        RandomAccessFile randRFile = new RandomAccessFile(newFile, "r");
//        int start=0;
//        for(int k=0;k<modifiedFragments.size();k++){
//            ModifiedFragmentInfo mfi = modifiedFragments.get(k);
//            byte[] bytes02 = new byte[(int)mfi.getLength()];
//            randRFile.seek(mfi.getStartIndex());
//            randRFile.read(bytes02);
//
//            incrementalFile.seek(start);
//            incrementalFile.write(bytes02,0,(int)mfi.getLength());
////            System.out.println("start: "+start + " StartIndex():"+mfi.startIndex+",endindex:"+(mfi.startIndex+mfi.getLength())+" "+new String(bytes02));
//            start = start + (int)mfi.getLength();
//        }


        //增量部分和未修改部分都存储
//        System.out.println("增量部分：");
        RandomAccessFile randRFile = new RandomAccessFile(newFile, "r");
        for(int k=0;k<modifiedFragments.size();k++){
            ModifiedFragmentInfo mfi = modifiedFragments.get(k);
            byte[] bytes02 = new byte[(int)mfi.getLength()];
            randRFile.seek(mfi.getStartIndex());
            randRFile.read(bytes02);

            incrementalFile.seek(mfi.getStartIndex());
            incrementalFile.write(bytes02,0,(int)mfi.getLength());
//            System.out.println("StartIndex():"+mfi.startIndex+",endindex:"+(mfi.startIndex+mfi.getLength())+new String(new String(bytes02).getBytes("iso-8859-1"),"UTF-8"));
        }

//        System.out.println("未修改部分：");
        RandomAccessFile randRFile2 = new RandomAccessFile(newFile, "r");
        for(int k=0;k<unchangedFragment.size();k++){
            UnchangedFragment uf = unchangedFragment.get(k);
            byte[] bytes03 = new byte[BYTE_SIZE];
            randRFile2.seek(uf.getStartIndex());
            randRFile2.read(bytes03);

            incrementalFile.seek(uf.getStartIndex());
            incrementalFile.write( bytes03,0,(int)uf.getLength());

//            System.out.println("StartIndex():"+uf.startIndex+",endindex:"+(uf.startIndex+uf.getLength())+new String(bytes03));
        }

    }
}
