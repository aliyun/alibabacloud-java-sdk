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

    }

}
