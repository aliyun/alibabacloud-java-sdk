// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class UpdateUserBucketConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<UpdateUserBucketConfigResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserBucketConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserBucketConfigResponseBody self = new UpdateUserBucketConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserBucketConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserBucketConfigResponseBody setData(java.util.List<UpdateUserBucketConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateUserBucketConfigResponseBodyData> getData() {
        return this.data;
    }

    public UpdateUserBucketConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserBucketConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateUserBucketConfigResponseBodyData extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionName")
        public String regionName;

        public static UpdateUserBucketConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserBucketConfigResponseBodyData self = new UpdateUserBucketConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateUserBucketConfigResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public UpdateUserBucketConfigResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateUserBucketConfigResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
