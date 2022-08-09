// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssStorageAndAccByBucketsResponseBody extends TeaModel {
    @NameInMap("BucketList")
    public java.util.List<GetOssStorageAndAccByBucketsResponseBodyBucketList> bucketList;

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
        @NameInMap("Acc")
        public Long acc;

        @NameInMap("Bucket")
        public String bucket;

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
