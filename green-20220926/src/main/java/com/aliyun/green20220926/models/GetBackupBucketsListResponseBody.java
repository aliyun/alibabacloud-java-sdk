// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBackupBucketsListResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetBackupBucketsListResponseBodyData> data;

    /**
     * <p>Backend-assigned ID, used to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBackupBucketsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBackupBucketsListResponseBody self = new GetBackupBucketsListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBackupBucketsListResponseBody setData(java.util.List<GetBackupBucketsListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBackupBucketsListResponseBodyData> getData() {
        return this.data;
    }

    public GetBackupBucketsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBackupBucketsListResponseBodyData extends TeaModel {
        /**
         * <p>OSS file storage bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>gj-bucket1</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetBackupBucketsListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBackupBucketsListResponseBodyData self = new GetBackupBucketsListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBackupBucketsListResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetBackupBucketsListResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
