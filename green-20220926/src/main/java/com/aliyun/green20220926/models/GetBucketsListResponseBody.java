// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBucketsListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetBucketsListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBucketsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketsListResponseBody self = new GetBucketsListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketsListResponseBody setData(java.util.List<GetBucketsListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBucketsListResponseBodyData> getData() {
        return this.data;
    }

    public GetBucketsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBucketsListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bucket_test</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetBucketsListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBucketsListResponseBodyData self = new GetBucketsListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBucketsListResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetBucketsListResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
