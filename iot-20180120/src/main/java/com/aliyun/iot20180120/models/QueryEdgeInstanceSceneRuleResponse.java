// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceSceneRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEdgeInstanceSceneRuleResponseData data;

    public static QueryEdgeInstanceSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceSceneRuleResponse self = new QueryEdgeInstanceSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceSceneRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceSceneRuleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceSceneRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceSceneRuleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceSceneRuleResponse setData(QueryEdgeInstanceSceneRuleResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceSceneRuleResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceSceneRuleResponseDataRuleList extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("IsExisted")
        @Validation(required = true)
        public Integer isExisted;

        public static QueryEdgeInstanceSceneRuleResponseDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceSceneRuleResponseDataRuleList self = new QueryEdgeInstanceSceneRuleResponseDataRuleList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceSceneRuleResponseDataRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryEdgeInstanceSceneRuleResponseDataRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryEdgeInstanceSceneRuleResponseDataRuleList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceSceneRuleResponseDataRuleList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEdgeInstanceSceneRuleResponseDataRuleList setIsExisted(Integer isExisted) {
            this.isExisted = isExisted;
            return this;
        }
        public Integer getIsExisted() {
            return this.isExisted;
        }

    }

    public static class QueryEdgeInstanceSceneRuleResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("RuleList")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceSceneRuleResponseDataRuleList> ruleList;

        public static QueryEdgeInstanceSceneRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceSceneRuleResponseData self = new QueryEdgeInstanceSceneRuleResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceSceneRuleResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceSceneRuleResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceSceneRuleResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceSceneRuleResponseData setRuleList(java.util.List<QueryEdgeInstanceSceneRuleResponseDataRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceSceneRuleResponseDataRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
