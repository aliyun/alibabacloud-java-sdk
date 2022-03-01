// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetUserBucketConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetUserBucketConfigResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserBucketConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserBucketConfigResponseBody self = new GetUserBucketConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserBucketConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserBucketConfigResponseBody setData(java.util.List<GetUserBucketConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUserBucketConfigResponseBodyData> getData() {
        return this.data;
    }

    public GetUserBucketConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserBucketConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserBucketConfigResponseBodyData extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionName")
        public String regionName;

        public static GetUserBucketConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserBucketConfigResponseBodyData self = new GetUserBucketConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserBucketConfigResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetUserBucketConfigResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetUserBucketConfigResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
