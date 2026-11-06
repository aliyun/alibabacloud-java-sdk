// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryDauReportDataResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates that the request is processed successfully. Other values indicate that the processing failed.</p>
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
     * <p>The list of daily active user report data.</p>
     */
    @NameInMap("DauReportDataModel")
    public java.util.List<QueryDauReportDataResponseBodyDauReportDataModel> dauReportDataModel;

    /**
     * <p>The description of the request processing result. Typically, success is returned if the request is successful.</p>
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
     * <p>The number of records per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
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
         * <p>The number of active users within the statistical epoch. Unit: users.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Dau")
        public Long dau;

        /**
         * <p>The statistics date. Format: yyyy-MM-dd. The string does not contain a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01</p>
         */
        @NameInMap("StatDate")
        public String statDate;

        /**
         * <p>The number of active users who generated sessions through streaming access within the statistical epoch. Unit: users.</p>
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
