package com.example.backuptest06.vm.common.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.event.ProgressEvent;
import com.aliyun.oss.event.ProgressEventType;
import com.aliyun.oss.event.ProgressListener;
import com.aliyun.oss.model.*;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aliyun.oss.ClientException;

import java.io.OutputStream;
import java.net.URL;
import java.util.Date;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author
 * @Description
 * @time 2022101413:58
 */
public class OSSObjectUtils {

        private static Logger logger = LoggerFactory.getLogger(OSSObjectUtils.class);
        private static OSSClient ossClient = new OSSClient("https://oss-cn-beijing.aliyuncs.com", "LTAI5tN9MbN6rDuvJxZMRTzZ", "4o88kaOkDjc0pJ1HzOUxfwP92PH4yv");

//private static OSSClient ossClient = new OSSClient("http://oss-cn-shanghai.aliyuncs.com", "0aHuVNGwxXsHDRIg", "6dvOMka7ON0DogefcWm09MbR4ofymB");

        private static String ENDPOINTINFO = ossClient.getEndpoint().toString();

        private OSSObjectUtils() {

        }

        /** * 创建Bucket * *@param bucketName *@throws OSSException *@throws ClientException */

        @SuppressWarnings("unused")

        @Deprecated

        private static void createBucket(String bucketName) throws OSSException, ClientException {

            if (!ossClient.doesBucketExist(bucketName)) {

                logger.info(ENDPOINTINFO + "创建bucketName：" + bucketName);

                ossClient.createBucket(bucketName);

            }

        }

        public static boolean isExistObject(String bucketName, String key) {

            boolean result = false;

            try {

                result = ossClient.doesObjectExist(bucketName, key);

            } catch (Exception e) {

                e.printStackTrace();

            }

            return result;

        }

        /** * 上传object * *@param bucketName *@param key *@param inputStream *@throws OSSException *@throws ClientException */

        public static void putObject(String bucketName, String key, InputStream inputStream)

                throws OSSException, ClientException {

            logger.info(ENDPOINTINFO + "上传Object,bucketName=" + bucketName + ",key=" + key);

            ossClient.putObject(bucketName, key, inputStream);

        }

        /** * 上传object * *@param bucketName *@param key *@param inputStream *@throws OSSException *@throws ClientException */

        public static void putObject(String bucketName, String key, File file) throws OSSException, ClientException {

            logger.info(ENDPOINTINFO + "上传Object,bucketName=" + bucketName + ",key=" + key);

            ossClient.putObject(bucketName, key, file);

        }

        /** * 上传object，带元数据 * *@param bucketName *@param key *@param inputStream *@param meta *@throws OSSException *@throws ClientException */

        public static void putObject(String bucketName, String key, InputStream inputStream, ObjectMetadata meta)

                throws OSSException, ClientException {

            logger.info(ENDPOINTINFO + "上传Object,bucketName=" + bucketName + ",key=" + key);

            ossClient.putObject(bucketName, key, inputStream, meta);

        }

        /** * 上传object，带进度listener * *@param bucketName *@param key *@param inputStream *@param listener *@throws Exception */

        public static void putObject(String bucketName, String key, InputStream inputStream,

                                     PutObjectProgressListener listener) throws Exception {

            logger.info(ENDPOINTINFO + "上传Object,带进度监听,bucketName=" + bucketName + ",key=" + key);

            ossClient.putObject(

                    new PutObjectRequest(bucketName, key, inputStream). withProgressListener(listener));

        }

        /** * 签名url * *@author kira *@param bucketName *@param key *@param expiration * 有效期 *@return */

        public static URL generatePresignedUrl(String bucketName, String key, Date expiration) {

            logger.info(ENDPOINTINFO + "获取URL,bucketName=" + bucketName + ",key=" + key);

            return ossClient.generatePresignedUrl(bucketName, key, expiration);

        }

        /** * 获取object,并读取流输出至OutputStream
         * 用于流式下载 * *@author kira *@param bucketName *@param key *@param out *@throws IOException */

        public static void getObjectToOutputStream(String bucketName, String key, OutputStream out) throws IOException {

            logger.info(ENDPOINTINFO + "获取Object,输出至OutputStream,bucketName=" + bucketName + ",key=" + key);

            byte[] buf = new byte[1024];

            InputStream in = ossClient.getObject(bucketName, key).getObjectContent();

            int length = 0;

            while ((length = in.read(buf)) > 0) {

                out.write(buf, 0, length);

            }

            in.close();

            out.close();

        }

        /** * 获取Object的Byte
         * 由于读取整个object至内存，故大文件不建议使用此方法，容易内存溢出 * *@author kira *@param bucketName *@param key *@return *@throws IOException */

        public static byte[] getObjectByte(String bucketName, String key) throws IOException {

            logger.info(ENDPOINTINFO + "获取Object的Byte,bucketName=" + bucketName + ",key=" + key);

            byte[] buf = new byte[1024];

            InputStream in = ossClient.getObject(bucketName, key).getObjectContent();

            for (int n = 0; n != -1;) {

                n = in.read(buf, 0, buf.length);

            }

            in.close();

            return buf;

        }

    public static class PutObjectProgressListener implements ProgressListener
    {
        private HttpSession session;
        private long bytesWritten = 0;
        private long totalBytes = -1;
        private boolean succeed = false;
        private int percent = 0;
        int sum = 0;

        // 构造方法中加入session
        public PutObjectProgressListener()
        {
        }

        public PutObjectProgressListener(HttpSession mSession, int sum)
        {
            this.session = mSession;
            this.sum = sum;
            session.setAttribute("upload_percent", 0);
            session.setAttribute("upload_sum", sum);
            System.out
                    .println("====================================================");
            System.out.println("sum:" + sum);
        }

        @Override
        public void progressChanged(ProgressEvent progressEvent)
        {
            long bytes = progressEvent.getBytes();
            ProgressEventType eventType = progressEvent.getEventType();
            switch (eventType)
            {
                case TRANSFER_STARTED_EVENT:
                    // logger.info("Start to upload......");
                    break;
                case REQUEST_CONTENT_LENGTH_EVENT:
                    this.totalBytes = bytes;
                    // logger.info(this.totalBytes +
                    // " bytes in total will be uploaded to OSS");
                    break;
                case REQUEST_BYTE_TRANSFER_EVENT:
                    this.bytesWritten += bytes;
                    if (this.totalBytes != -1)
                    {
                        percent = (int) (this.bytesWritten * 100.0 / this.totalBytes);
                        // 将进度percent放入session中
                        session.setAttribute("upload_percent", percent);
                    }
                    else
                    {
                    }
                    break;
                case TRANSFER_COMPLETED_EVENT:
                    this.succeed = true;

                    break;
                case TRANSFER_FAILED_EVENT:

                    break;
                default:
                    break;
            }

//控制台打印进度

            System.out.println("percent:" + percent);

        }

        public boolean isSucceed()
        {
            return succeed;
        }
    }

        public static void main(String[] args){

            /*List list= ossClient.listBuckets(); for(Bucket b:list){ System.out.println(b.getName()); }*/

//file/policyfile/236e7e90-0d9c-4fa7-b7f3-ffededb3f8d8.png

            ObjectListing list=ossClient.listObjects("ecs-backup-recovery ","file/policyfile/");

            for(OSSObjectSummary ossos:list.getObjectSummaries()){

                System.out.println("##############################");

                System.out.println(ossos.getKey());

//ossClient.deleteObject("jyjyimage", ossos.getKey());

            }

//System.out.println(DateUtils.sdf_yMdHmsS.format(new Date()));

//System.out.println(ossClient.doesObjectExist("jyjyimage", "schoolbase-video/20170408134128185_WI4QUI105.mps4"));

        }

    }
