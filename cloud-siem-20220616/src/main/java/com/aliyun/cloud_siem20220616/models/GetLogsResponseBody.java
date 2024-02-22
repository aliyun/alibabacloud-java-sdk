// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetLogsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The results of the log query.</p>
     */
    @NameInMap("Data")
    public GetLogsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogsResponseBody self = new GetLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogsResponseBody setData(GetLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLogsResponseBodyData getData() {
        return this.data;
    }

    public GetLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogsResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The page number. Pages start from page 1.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of logs.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetLogsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyDataPageInfo self = new GetLogsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetLogsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetLogsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetLogsResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The status of the log query. Valid values:</p>
         * <br>
         * <p>*   true: The query is complete and the returned result is complete.</p>
         * <p>*   false: The query is complete but the returned result is incomplete. You must resend the request to obtain the complete result.</p>
         */
        @NameInMap("CompleteOrNot")
        public Boolean completeOrNot;

        /**
         * <p>The time period of the log query. Unit: milliseconds.</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The number of entries returned.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Indicated whether an analytic statement is contained. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("HasSql")
        public Boolean hasSql;

        /**
         * <p>The index fields of the logs.</p>
         */
        @NameInMap("Keys")
        public java.util.List<String> keys;

        /**
         * <p>The raw data generated in the query.</p>
         */
        @NameInMap("Lines")
        public java.util.List<?> lines;

        public static GetLogsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyDataResponseData self = new GetLogsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyDataResponseData setCompleteOrNot(Boolean completeOrNot) {
            this.completeOrNot = completeOrNot;
            return this;
        }
        public Boolean getCompleteOrNot() {
            return this.completeOrNot;
        }

        public GetLogsResponseBodyDataResponseData setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public GetLogsResponseBodyDataResponseData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetLogsResponseBodyDataResponseData setHasSql(Boolean hasSql) {
            this.hasSql = hasSql;
            return this;
        }
        public Boolean getHasSql() {
            return this.hasSql;
        }

        public GetLogsResponseBodyDataResponseData setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public GetLogsResponseBodyDataResponseData setLines(java.util.List<?> lines) {
            this.lines = lines;
            return this;
        }
        public java.util.List<?> getLines() {
            return this.lines;
        }

    }

    public static class GetLogsResponseBodyData extends TeaModel {
        /**
         * <p>The result on the current page.</p>
         */
        @NameInMap("PageInfo")
        public GetLogsResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The content of the log.</p>
         */
        @NameInMap("ResponseData")
        public GetLogsResponseBodyDataResponseData responseData;

        public static GetLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyData self = new GetLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyData setPageInfo(GetLogsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetLogsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public GetLogsResponseBodyData setResponseData(GetLogsResponseBodyDataResponseData responseData) {
            this.responseData = responseData;
            return this;
        }
        public GetLogsResponseBodyDataResponseData getResponseData() {
            return this.responseData;
        }

    }

}
