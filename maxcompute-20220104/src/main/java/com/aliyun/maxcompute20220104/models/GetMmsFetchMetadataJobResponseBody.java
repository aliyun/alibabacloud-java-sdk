// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsFetchMetadataJobResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsFetchMetadataJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>5CA6292A-E301-5CD8-B4E2-AF060F99147B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsFetchMetadataJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsFetchMetadataJobResponseBody self = new GetMmsFetchMetadataJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsFetchMetadataJobResponseBody setData(GetMmsFetchMetadataJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsFetchMetadataJobResponseBodyData getData() {
        return this.data;
    }

    public GetMmsFetchMetadataJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsFetchMetadataJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-12-16 19:10:07</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>unexpected exception</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>1000002</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("progress")
        public Float progress;

        /**
         * <strong>example:</strong>
         * <p>{&quot;databases&quot;:5,&quot;tables&quot;:75,&quot;partitions&quot;:215}</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>2024-12-16 19:09:37</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SCAN_DOING</p>
         */
        @NameInMap("status")
        public String status;

        public static GetMmsFetchMetadataJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsFetchMetadataJobResponseBodyData self = new GetMmsFetchMetadataJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsFetchMetadataJobResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetMmsFetchMetadataJobResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetMmsFetchMetadataJobResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsFetchMetadataJobResponseBodyData setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public GetMmsFetchMetadataJobResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetMmsFetchMetadataJobResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsFetchMetadataJobResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMmsFetchMetadataJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
