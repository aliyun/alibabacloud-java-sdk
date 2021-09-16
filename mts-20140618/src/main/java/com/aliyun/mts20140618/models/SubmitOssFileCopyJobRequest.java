// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitOssFileCopyJobRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("SourceStorage")
    public SubmitOssFileCopyJobRequestSourceStorage sourceStorage;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Notify")
    public String notify;

    @NameInMap("TargetStorage")
    public SubmitOssFileCopyJobRequestTargetStorage targetStorage;

    public static SubmitOssFileCopyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOssFileCopyJobRequest self = new SubmitOssFileCopyJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOssFileCopyJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SubmitOssFileCopyJobRequest setSourceStorage(SubmitOssFileCopyJobRequestSourceStorage sourceStorage) {
        this.sourceStorage = sourceStorage;
        return this;
    }
    public SubmitOssFileCopyJobRequestSourceStorage getSourceStorage() {
        return this.sourceStorage;
    }

    public SubmitOssFileCopyJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitOssFileCopyJobRequest setNotify(String notify) {
        this.notify = notify;
        return this;
    }
    public String getNotify() {
        return this.notify;
    }

    public SubmitOssFileCopyJobRequest setTargetStorage(SubmitOssFileCopyJobRequestTargetStorage targetStorage) {
        this.targetStorage = targetStorage;
        return this;
    }
    public SubmitOssFileCopyJobRequestTargetStorage getTargetStorage() {
        return this.targetStorage;
    }

    public static class SubmitOssFileCopyJobRequestSourceStorage extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("BucketOwnerId")
        public Long bucketOwnerId;

        @NameInMap("FileNames")
        public String fileNames;

        @NameInMap("ObjectPrefix")
        public String objectPrefix;

        @NameInMap("ObjectRoleName")
        public String objectRoleName;

        @NameInMap("S3Provider")
        public String s3Provider;

        @NameInMap("S3Endpoint")
        public String s3Endpoint;

        @NameInMap("S3AccessKey")
        public String s3AccessKey;

        @NameInMap("S3SecretKey")
        public String s3SecretKey;

        @NameInMap("S3SessionToken")
        public String s3SessionToken;

        public static SubmitOssFileCopyJobRequestSourceStorage build(java.util.Map<String, ?> map) throws Exception {
            SubmitOssFileCopyJobRequestSourceStorage self = new SubmitOssFileCopyJobRequestSourceStorage();
            return TeaModel.build(map, self);
        }

        public SubmitOssFileCopyJobRequestSourceStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setBucketOwnerId(Long bucketOwnerId) {
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setFileNames(String fileNames) {
            this.fileNames = fileNames;
            return this;
        }
        public String getFileNames() {
            return this.fileNames;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setObjectPrefix(String objectPrefix) {
            this.objectPrefix = objectPrefix;
            return this;
        }
        public String getObjectPrefix() {
            return this.objectPrefix;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setObjectRoleName(String objectRoleName) {
            this.objectRoleName = objectRoleName;
            return this;
        }
        public String getObjectRoleName() {
            return this.objectRoleName;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setS3Provider(String s3Provider) {
            this.s3Provider = s3Provider;
            return this;
        }
        public String getS3Provider() {
            return this.s3Provider;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setS3Endpoint(String s3Endpoint) {
            this.s3Endpoint = s3Endpoint;
            return this;
        }
        public String getS3Endpoint() {
            return this.s3Endpoint;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setS3AccessKey(String s3AccessKey) {
            this.s3AccessKey = s3AccessKey;
            return this;
        }
        public String getS3AccessKey() {
            return this.s3AccessKey;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setS3SecretKey(String s3SecretKey) {
            this.s3SecretKey = s3SecretKey;
            return this;
        }
        public String getS3SecretKey() {
            return this.s3SecretKey;
        }

        public SubmitOssFileCopyJobRequestSourceStorage setS3SessionToken(String s3SessionToken) {
            this.s3SessionToken = s3SessionToken;
            return this;
        }
        public String getS3SessionToken() {
            return this.s3SessionToken;
        }

    }

    public static class SubmitOssFileCopyJobRequestTargetStorage extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("BucketOwnerId")
        public Long bucketOwnerId;

        @NameInMap("ObjectPrefix")
        public String objectPrefix;

        @NameInMap("ObjectRoleName")
        public String objectRoleName;

        @NameInMap("S3Provider")
        public String s3Provider;

        @NameInMap("S3Endpoint")
        public String s3Endpoint;

        @NameInMap("S3AccessKey")
        public String s3AccessKey;

        @NameInMap("S3SecretKey")
        public String s3SecretKey;

        @NameInMap("S3SessionToken")
        public String s3SessionToken;

        public static SubmitOssFileCopyJobRequestTargetStorage build(java.util.Map<String, ?> map) throws Exception {
            SubmitOssFileCopyJobRequestTargetStorage self = new SubmitOssFileCopyJobRequestTargetStorage();
            return TeaModel.build(map, self);
        }

        public SubmitOssFileCopyJobRequestTargetStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setBucketOwnerId(Long bucketOwnerId) {
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setObjectPrefix(String objectPrefix) {
            this.objectPrefix = objectPrefix;
            return this;
        }
        public String getObjectPrefix() {
            return this.objectPrefix;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setObjectRoleName(String objectRoleName) {
            this.objectRoleName = objectRoleName;
            return this;
        }
        public String getObjectRoleName() {
            return this.objectRoleName;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setS3Provider(String s3Provider) {
            this.s3Provider = s3Provider;
            return this;
        }
        public String getS3Provider() {
            return this.s3Provider;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setS3Endpoint(String s3Endpoint) {
            this.s3Endpoint = s3Endpoint;
            return this;
        }
        public String getS3Endpoint() {
            return this.s3Endpoint;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setS3AccessKey(String s3AccessKey) {
            this.s3AccessKey = s3AccessKey;
            return this;
        }
        public String getS3AccessKey() {
            return this.s3AccessKey;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setS3SecretKey(String s3SecretKey) {
            this.s3SecretKey = s3SecretKey;
            return this;
        }
        public String getS3SecretKey() {
            return this.s3SecretKey;
        }

        public SubmitOssFileCopyJobRequestTargetStorage setS3SessionToken(String s3SessionToken) {
            this.s3SessionToken = s3SessionToken;
            return this;
        }
        public String getS3SessionToken() {
            return this.s3SessionToken;
        }

    }

}
