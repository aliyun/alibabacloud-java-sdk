// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySummarySceneRuleLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySummarySceneRuleLogResponseData data;

    public static QuerySummarySceneRuleLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySummarySceneRuleLogResponse self = new QuerySummarySceneRuleLogResponse();
        return TeaModel.build(map, self);
    }

    public QuerySummarySceneRuleLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySummarySceneRuleLogResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySummarySceneRuleLogResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySummarySceneRuleLogResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySummarySceneRuleLogResponse setData(QuerySummarySceneRuleLogResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySummarySceneRuleLogResponseData getData() {
        return this.data;
    }

    public static class QuerySummarySceneRuleLogResponseDataLogListLogInfo extends TeaModel {
        @NameInMap("LogTime")
        @Validation(required = true)
        public Integer logTime;

        @NameInMap("Result")
        @Validation(required = true)
        public String result;

        @NameInMap("TraceId")
        @Validation(required = true)
        public String traceId;

        public static QuerySummarySceneRuleLogResponseDataLogListLogInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySummarySceneRuleLogResponseDataLogListLogInfo self = new QuerySummarySceneRuleLogResponseDataLogListLogInfo();
            return TeaModel.build(map, self);
        }

        public QuerySummarySceneRuleLogResponseDataLogListLogInfo setLogTime(Integer logTime) {
            this.logTime = logTime;
            return this;
        }
        public Integer getLogTime() {
            return this.logTime;
        }

        public QuerySummarySceneRuleLogResponseDataLogListLogInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QuerySummarySceneRuleLogResponseDataLogListLogInfo setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class QuerySummarySceneRuleLogResponseDataLogList extends TeaModel {
        @NameInMap("LogInfo")
        @Validation(required = true)
        public java.util.List<QuerySummarySceneRuleLogResponseDataLogListLogInfo> logInfo;

        public static QuerySummarySceneRuleLogResponseDataLogList build(java.util.Map<String, ?> map) throws Exception {
            QuerySummarySceneRuleLogResponseDataLogList self = new QuerySummarySceneRuleLogResponseDataLogList();
            return TeaModel.build(map, self);
        }

        public QuerySummarySceneRuleLogResponseDataLogList setLogInfo(java.util.List<QuerySummarySceneRuleLogResponseDataLogListLogInfo> logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public java.util.List<QuerySummarySceneRuleLogResponseDataLogListLogInfo> getLogInfo() {
            return this.logInfo;
        }

    }

    public static class QuerySummarySceneRuleLogResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("LogList")
        @Validation(required = true)
        public QuerySummarySceneRuleLogResponseDataLogList logList;

        public static QuerySummarySceneRuleLogResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySummarySceneRuleLogResponseData self = new QuerySummarySceneRuleLogResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySummarySceneRuleLogResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySummarySceneRuleLogResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySummarySceneRuleLogResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySummarySceneRuleLogResponseData setLogList(QuerySummarySceneRuleLogResponseDataLogList logList) {
            this.logList = logList;
            return this;
        }
        public QuerySummarySceneRuleLogResponseDataLogList getLogList() {
            return this.logList;
        }

    }

}
