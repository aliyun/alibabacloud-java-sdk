// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryNodeReportDataResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates that the request is successful. Other values indicate that the request failed.</p>
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
     * <p>The description of the request processing result. If the request is successful, success is usually returned.</p>
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
     * <p>The list of node report data.</p>
     */
    @NameInMap("ReportDataModel")
    public java.util.List<QueryNodeReportDataResponseBodyReportDataModel> reportDataModel;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryNodeReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNodeReportDataResponseBody self = new QueryNodeReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNodeReportDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryNodeReportDataResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryNodeReportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNodeReportDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryNodeReportDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryNodeReportDataResponseBody setReportDataModel(java.util.List<QueryNodeReportDataResponseBodyReportDataModel> reportDataModel) {
        this.reportDataModel = reportDataModel;
        return this;
    }
    public java.util.List<QueryNodeReportDataResponseBodyReportDataModel> getReportDataModel() {
        return this.reportDataModel;
    }

    public QueryNodeReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNodeReportDataResponseBodyReportDataModel extends TeaModel {
        /**
         * <p>The total number of nodes for the record.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        /**
         * <p>The number of pay-as-you-go nodes in the record.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("PostpaidNodeCount")
        public Long postpaidNodeCount;

        /**
         * <p>The number of subscription nodes in the record.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PrepaidNodeCount")
        public Long prepaidNodeCount;

        /**
         * <p>The statistical time. The 1d granularity returns the time in the yyyy-MM-dd format. The 1m, 30m, and 6h granularities return the time in the yyyy-MM-dd HH:mm format. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01</p>
         */
        @NameInMap("StatDate")
        public String statDate;

        public static QueryNodeReportDataResponseBodyReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QueryNodeReportDataResponseBodyReportDataModel self = new QueryNodeReportDataResponseBodyReportDataModel();
            return TeaModel.build(map, self);
        }

        public QueryNodeReportDataResponseBodyReportDataModel setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public QueryNodeReportDataResponseBodyReportDataModel setPostpaidNodeCount(Long postpaidNodeCount) {
            this.postpaidNodeCount = postpaidNodeCount;
            return this;
        }
        public Long getPostpaidNodeCount() {
            return this.postpaidNodeCount;
        }

        public QueryNodeReportDataResponseBodyReportDataModel setPrepaidNodeCount(Long prepaidNodeCount) {
            this.prepaidNodeCount = prepaidNodeCount;
            return this;
        }
        public Long getPrepaidNodeCount() {
            return this.prepaidNodeCount;
        }

        public QueryNodeReportDataResponseBodyReportDataModel setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

    }

}
