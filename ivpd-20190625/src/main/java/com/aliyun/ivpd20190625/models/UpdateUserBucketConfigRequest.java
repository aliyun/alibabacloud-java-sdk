// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class UpdateUserBucketConfigRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UpdateUserBucketConfigRequestData> data;

    public static UpdateUserBucketConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserBucketConfigRequest self = new UpdateUserBucketConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserBucketConfigRequest setData(java.util.List<UpdateUserBucketConfigRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateUserBucketConfigRequestData> getData() {
        return this.data;
    }

    public static class UpdateUserBucketConfigRequestData extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Region")
        public String region;

        public static UpdateUserBucketConfigRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserBucketConfigRequestData self = new UpdateUserBucketConfigRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateUserBucketConfigRequestData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public UpdateUserBucketConfigRequestData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
