// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySceneRuleResponse extends TeaModel {
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
    public QuerySceneRuleResponseData data;

    public static QuerySceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneRuleResponse self = new QuerySceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySceneRuleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySceneRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySceneRuleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySceneRuleResponse setData(QuerySceneRuleResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySceneRuleResponseData getData() {
        return this.data;
    }

    public static class QuerySceneRuleResponseDataRuleList extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("RuleDescription")
        @Validation(required = true)
        public String ruleDescription;

        @NameInMap("RuleStatus")
        @Validation(required = true)
        public Integer ruleStatus;

        public static QuerySceneRuleResponseDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneRuleResponseDataRuleList self = new QuerySceneRuleResponseDataRuleList();
            return TeaModel.build(map, self);
        }

        public QuerySceneRuleResponseDataRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QuerySceneRuleResponseDataRuleList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySceneRuleResponseDataRuleList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySceneRuleResponseDataRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QuerySceneRuleResponseDataRuleList setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public QuerySceneRuleResponseDataRuleList setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

    }

    public static class QuerySceneRuleResponseData extends TeaModel {
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
        public java.util.List<QuerySceneRuleResponseDataRuleList> ruleList;

        public static QuerySceneRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneRuleResponseData self = new QuerySceneRuleResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySceneRuleResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySceneRuleResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySceneRuleResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySceneRuleResponseData setRuleList(java.util.List<QuerySceneRuleResponseDataRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<QuerySceneRuleResponseDataRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
