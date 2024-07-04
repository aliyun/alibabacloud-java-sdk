// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssStorageAndAccByBucketsResponseBody extends TeaModel {
    /**
     * <p>The information about the bucket.</p>
     */
    @NameInMap("BucketList")
    public java.util.List<GetOssStorageAndAccByBucketsResponseBodyBucketList> bucketList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>112F4860-F1B2-58DD-8FC0-75F19DA1C4BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOssStorageAndAccByBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssStorageAndAccByBucketsResponseBody self = new GetOssStorageAndAccByBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssStorageAndAccByBucketsResponseBody setBucketList(java.util.List<GetOssStorageAndAccByBucketsResponseBodyBucketList> bucketList) {
        this.bucketList = bucketList;
        return this;
    }
    public java.util.List<GetOssStorageAndAccByBucketsResponseBodyBucketList> getBucketList() {
        return this.bucketList;
    }

    public GetOssStorageAndAccByBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssStorageAndAccByBucketsResponseBodyBucketList extends TeaModel {
        /**
         * <p>The number of times that the bucket is accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Acc")
        public Long acc;

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The storage usage of the bucket. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("StorageUsageByte")
        public Long storageUsageByte;

        public static GetOssStorageAndAccByBucketsResponseBodyBucketList build(java.util.Map<String, ?> map) throws Exception {
            GetOssStorageAndAccByBucketsResponseBodyBucketList self = new GetOssStorageAndAccByBucketsResponseBodyBucketList();
            return TeaModel.build(map, self);
        }

        public GetOssStorageAndAccByBucketsResponseBodyBucketList setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
        }

        public GetOssStorageAndAccByBucketsResponseBodyBucketList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetOssStorageAndAccByBucketsResponseBodyBucketList setStorageUsageByte(Long storageUsageByte) {
            this.storageUsageByte = storageUsageByte;
            return this;
        }
        public Long getStorageUsageByte() {
            return this.storageUsageByte;
        }

    }

}
