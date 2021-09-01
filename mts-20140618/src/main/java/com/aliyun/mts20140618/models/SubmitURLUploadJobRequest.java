// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitURLUploadJobRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("SourceFileURL")
    public String sourceFileURL;

    @NameInMap("TargetStorage")
    public SubmitURLUploadJobRequestTargetStorage targetStorage;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Notify")
    public String notify;

    public static SubmitURLUploadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitURLUploadJobRequest self = new SubmitURLUploadJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitURLUploadJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SubmitURLUploadJobRequest setSourceFileURL(String sourceFileURL) {
        this.sourceFileURL = sourceFileURL;
        return this;
    }
    public String getSourceFileURL() {
        return this.sourceFileURL;
    }

    public SubmitURLUploadJobRequest setTargetStorage(SubmitURLUploadJobRequestTargetStorage targetStorage) {
        this.targetStorage = targetStorage;
        return this;
    }
    public SubmitURLUploadJobRequestTargetStorage getTargetStorage() {
        return this.targetStorage;
    }

    public SubmitURLUploadJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitURLUploadJobRequest setNotify(String notify) {
        this.notify = notify;
        return this;
    }
    public String getNotify() {
        return this.notify;
    }

    public static class SubmitURLUploadJobRequestTargetStorage extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("BucketOwnerId")
        public String bucketOwnerId;

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

        public static SubmitURLUploadJobRequestTargetStorage build(java.util.Map<String, ?> map) throws Exception {
            SubmitURLUploadJobRequestTargetStorage self = new SubmitURLUploadJobRequestTargetStorage();
            return TeaModel.build(map, self);
        }

        public SubmitURLUploadJobRequestTargetStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitURLUploadJobRequestTargetStorage setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public SubmitURLUploadJobRequestTargetStorage setBucketOwnerId(String bucketOwnerId) {
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }
        public String getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        public SubmitURLUploadJobRequestTargetStorage setObjectRoleName(String objectRoleName) {
            this.objectRoleName = objectRoleName;
            return this;
        }
        public String getObjectRoleName() {
            return this.objectRoleName;
        }

        public SubmitURLUploadJobRequestTargetStorage setS3Provider(String s3Provider) {
            this.s3Provider = s3Provider;
            return this;
        }
        public String getS3Provider() {
            return this.s3Provider;
        }

        public SubmitURLUploadJobRequestTargetStorage setS3Endpoint(String s3Endpoint) {
            this.s3Endpoint = s3Endpoint;
            return this;
        }
        public String getS3Endpoint() {
            return this.s3Endpoint;
        }

        public SubmitURLUploadJobRequestTargetStorage setS3AccessKey(String s3AccessKey) {
            this.s3AccessKey = s3AccessKey;
            return this;
        }
        public String getS3AccessKey() {
            return this.s3AccessKey;
        }

        public SubmitURLUploadJobRequestTargetStorage setS3SecretKey(String s3SecretKey) {
            this.s3SecretKey = s3SecretKey;
            return this;
        }
        public String getS3SecretKey() {
            return this.s3SecretKey;
        }

        public SubmitURLUploadJobRequestTargetStorage setS3SessionToken(String s3SessionToken) {
            this.s3SessionToken = s3SessionToken;
            return this;
        }
        public String getS3SessionToken() {
            return this.s3SessionToken;
        }

    }

}
