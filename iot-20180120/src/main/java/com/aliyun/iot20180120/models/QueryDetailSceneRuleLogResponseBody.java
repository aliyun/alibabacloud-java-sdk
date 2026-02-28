// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDetailSceneRuleLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDetailSceneRuleLogResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDetailSceneRuleLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailSceneRuleLogResponseBody self = new QueryDetailSceneRuleLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDetailSceneRuleLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDetailSceneRuleLogResponseBody setData(QueryDetailSceneRuleLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDetailSceneRuleLogResponseBodyData getData() {
        return this.data;
    }

    public QueryDetailSceneRuleLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDetailSceneRuleLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDetailSceneRuleLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDetailSceneRuleLogResponseBodyDataLogList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PkDn")
        public String pkDn;

        public static QueryDetailSceneRuleLogResponseBodyDataLogList build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailSceneRuleLogResponseBodyDataLogList self = new QueryDetailSceneRuleLogResponseBodyDataLogList();
            return TeaModel.build(map, self);
        }

        public QueryDetailSceneRuleLogResponseBodyDataLogList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryDetailSceneRuleLogResponseBodyDataLogList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDetailSceneRuleLogResponseBodyDataLogList setPkDn(String pkDn) {
            this.pkDn = pkDn;
            return this;
        }
        public String getPkDn() {
            return this.pkDn;
        }

    }

    public static class QueryDetailSceneRuleLogResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("LogList")
        public java.util.List<QueryDetailSceneRuleLogResponseBodyDataLogList> logList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryDetailSceneRuleLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailSceneRuleLogResponseBodyData self = new QueryDetailSceneRuleLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDetailSceneRuleLogResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryDetailSceneRuleLogResponseBodyData setLogList(java.util.List<QueryDetailSceneRuleLogResponseBodyDataLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<QueryDetailSceneRuleLogResponseBodyDataLogList> getLogList() {
            return this.logList;
        }

        public QueryDetailSceneRuleLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDetailSceneRuleLogResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
