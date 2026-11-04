// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QuerySessionReportDataResponseBody extends TeaModel {
    /**
     * <p>The business status code. <code>200</code> indicates that the request was processed successfully. Other values indicate that the processing failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The description of the request processing result. <code>success</code> is usually returned when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number corresponding to the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of session report data.</p>
     */
    @NameInMap("ReportDataModel")
    public java.util.List<QuerySessionReportDataResponseBodyReportDataModel> reportDataModel;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuerySessionReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionReportDataResponseBody self = new QuerySessionReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionReportDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySessionReportDataResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QuerySessionReportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySessionReportDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QuerySessionReportDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySessionReportDataResponseBody setReportDataModel(java.util.List<QuerySessionReportDataResponseBodyReportDataModel> reportDataModel) {
        this.reportDataModel = reportDataModel;
        return this;
    }
    public java.util.List<QuerySessionReportDataResponseBodyReportDataModel> getReportDataModel() {
        return this.reportDataModel;
    }

    public QuerySessionReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySessionReportDataResponseBodyReportDataModel extends TeaModel {
        /**
         * <p>The number of connected sessions in the record.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ConnectSessionCount")
        public Long connectSessionCount;

        /**
         * <p>The total number of sessions corresponding to the record.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The statistical time. The <code>1d</code> granularity returns <code>yyyy-MM-dd</code>. The <code>1m</code>, <code>30m</code>, and <code>6h</code> granularities return <code>yyyy-MM-dd HH:mm</code>. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01</p>
         */
        @NameInMap("StatDate")
        public String statDate;

        /**
         * <p>The number of sessions established through streaming access in the record.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("StreamingSessionCount")
        public Long streamingSessionCount;

        public static QuerySessionReportDataResponseBodyReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QuerySessionReportDataResponseBodyReportDataModel self = new QuerySessionReportDataResponseBodyReportDataModel();
            return TeaModel.build(map, self);
        }

        public QuerySessionReportDataResponseBodyReportDataModel setConnectSessionCount(Long connectSessionCount) {
            this.connectSessionCount = connectSessionCount;
            return this;
        }
        public Long getConnectSessionCount() {
            return this.connectSessionCount;
        }

        public QuerySessionReportDataResponseBodyReportDataModel setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public QuerySessionReportDataResponseBodyReportDataModel setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

        public QuerySessionReportDataResponseBodyReportDataModel setStreamingSessionCount(Long streamingSessionCount) {
            this.streamingSessionCount = streamingSessionCount;
            return this;
        }
        public Long getStreamingSessionCount() {
            return this.streamingSessionCount;
        }

    }

}
