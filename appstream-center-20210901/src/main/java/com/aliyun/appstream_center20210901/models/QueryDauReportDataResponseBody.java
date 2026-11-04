// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryDauReportDataResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of <code>200</code> indicates that the request was processed. Other values indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of daily active user report data.</p>
     */
    @NameInMap("DauReportDataModel")
    public java.util.List<QueryDauReportDataResponseBodyDauReportDataModel> dauReportDataModel;

    /**
     * <p>The message about the request processing result. If the request is successful, <code>success</code> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDauReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDauReportDataResponseBody self = new QueryDauReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDauReportDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDauReportDataResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryDauReportDataResponseBody setDauReportDataModel(java.util.List<QueryDauReportDataResponseBodyDauReportDataModel> dauReportDataModel) {
        this.dauReportDataModel = dauReportDataModel;
        return this;
    }
    public java.util.List<QueryDauReportDataResponseBodyDauReportDataModel> getDauReportDataModel() {
        return this.dauReportDataModel;
    }

    public QueryDauReportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDauReportDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDauReportDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDauReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDauReportDataResponseBodyDauReportDataModel extends TeaModel {
        /**
         * <p>The number of active users within the statistical period. Unit: users.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Dau")
        public Long dau;

        /**
         * <p>The statistical date. Format: <code>yyyy-MM-dd</code>. The string does not contain time zone information and is interpreted as a calendar date in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01</p>
         */
        @NameInMap("StatDate")
        public String statDate;

        /**
         * <p>The number of active users who initiated sessions through streaming access within the statistical period. Unit: users.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("StreamingDau")
        public Long streamingDau;

        public static QueryDauReportDataResponseBodyDauReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QueryDauReportDataResponseBodyDauReportDataModel self = new QueryDauReportDataResponseBodyDauReportDataModel();
            return TeaModel.build(map, self);
        }

        public QueryDauReportDataResponseBodyDauReportDataModel setDau(Long dau) {
            this.dau = dau;
            return this;
        }
        public Long getDau() {
            return this.dau;
        }

        public QueryDauReportDataResponseBodyDauReportDataModel setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

        public QueryDauReportDataResponseBodyDauReportDataModel setStreamingDau(Long streamingDau) {
            this.streamingDau = streamingDau;
            return this;
        }
        public Long getStreamingDau() {
            return this.streamingDau;
        }

    }

}
