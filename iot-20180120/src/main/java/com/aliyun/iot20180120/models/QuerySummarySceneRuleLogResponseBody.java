// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySummarySceneRuleLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySummarySceneRuleLogResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>2279A994-3E7D-4EC6-BD17-FA0D0EC2EC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySummarySceneRuleLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySummarySceneRuleLogResponseBody self = new QuerySummarySceneRuleLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySummarySceneRuleLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySummarySceneRuleLogResponseBody setData(QuerySummarySceneRuleLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySummarySceneRuleLogResponseBodyData getData() {
        return this.data;
    }

    public QuerySummarySceneRuleLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySummarySceneRuleLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySummarySceneRuleLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1582373706</p>
         */
        @NameInMap("LogTime")
        public Integer logTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>a6a5b5df1582373508176121******</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo self = new QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo();
            return TeaModel.build(map, self);
        }

        public QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo setLogTime(Integer logTime) {
            this.logTime = logTime;
            return this;
        }
        public Integer getLogTime() {
            return this.logTime;
        }

        public QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class QuerySummarySceneRuleLogResponseBodyDataLogList extends TeaModel {
        @NameInMap("LogInfo")
        public java.util.List<QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo> logInfo;

        public static QuerySummarySceneRuleLogResponseBodyDataLogList build(java.util.Map<String, ?> map) throws Exception {
            QuerySummarySceneRuleLogResponseBodyDataLogList self = new QuerySummarySceneRuleLogResponseBodyDataLogList();
            return TeaModel.build(map, self);
        }

        public QuerySummarySceneRuleLogResponseBodyDataLogList setLogInfo(java.util.List<QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo> logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public java.util.List<QuerySummarySceneRuleLogResponseBodyDataLogListLogInfo> getLogInfo() {
            return this.logInfo;
        }

    }

    public static class QuerySummarySceneRuleLogResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("LogList")
        public QuerySummarySceneRuleLogResponseBodyDataLogList logList;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySummarySceneRuleLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySummarySceneRuleLogResponseBodyData self = new QuerySummarySceneRuleLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySummarySceneRuleLogResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySummarySceneRuleLogResponseBodyData setLogList(QuerySummarySceneRuleLogResponseBodyDataLogList logList) {
            this.logList = logList;
            return this;
        }
        public QuerySummarySceneRuleLogResponseBodyDataLogList getLogList() {
            return this.logList;
        }

        public QuerySummarySceneRuleLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySummarySceneRuleLogResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
