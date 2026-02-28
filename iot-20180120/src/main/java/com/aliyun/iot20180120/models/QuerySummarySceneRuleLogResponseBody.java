// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySummarySceneRuleLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySummarySceneRuleLogResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("LogTime")
        public Integer logTime;

        @NameInMap("Result")
        public String result;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("LogList")
        public QuerySummarySceneRuleLogResponseBodyDataLogList logList;

        @NameInMap("PageSize")
        public Integer pageSize;

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
