// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDetailSceneRuleLogResponse extends TeaModel {
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
    public QueryDetailSceneRuleLogResponseData data;

    public static QueryDetailSceneRuleLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailSceneRuleLogResponse self = new QueryDetailSceneRuleLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryDetailSceneRuleLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDetailSceneRuleLogResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDetailSceneRuleLogResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDetailSceneRuleLogResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDetailSceneRuleLogResponse setData(QueryDetailSceneRuleLogResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDetailSceneRuleLogResponseData getData() {
        return this.data;
    }

    public static class QueryDetailSceneRuleLogResponseDataLogList extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("PkDn")
        @Validation(required = true)
        public String pkDn;

        public static QueryDetailSceneRuleLogResponseDataLogList build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailSceneRuleLogResponseDataLogList self = new QueryDetailSceneRuleLogResponseDataLogList();
            return TeaModel.build(map, self);
        }

        public QueryDetailSceneRuleLogResponseDataLogList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryDetailSceneRuleLogResponseDataLogList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDetailSceneRuleLogResponseDataLogList setPkDn(String pkDn) {
            this.pkDn = pkDn;
            return this;
        }
        public String getPkDn() {
            return this.pkDn;
        }

    }

    public static class QueryDetailSceneRuleLogResponseData extends TeaModel {
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
        public java.util.List<QueryDetailSceneRuleLogResponseDataLogList> logList;

        public static QueryDetailSceneRuleLogResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailSceneRuleLogResponseData self = new QueryDetailSceneRuleLogResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDetailSceneRuleLogResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDetailSceneRuleLogResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDetailSceneRuleLogResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryDetailSceneRuleLogResponseData setLogList(java.util.List<QueryDetailSceneRuleLogResponseDataLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<QueryDetailSceneRuleLogResponseDataLogList> getLogList() {
            return this.logList;
        }

    }

}
