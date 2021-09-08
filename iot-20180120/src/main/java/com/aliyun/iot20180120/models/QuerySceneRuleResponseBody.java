// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySceneRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QuerySceneRuleResponseBodyData data;

    public static QuerySceneRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneRuleResponseBody self = new QuerySceneRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySceneRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySceneRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySceneRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySceneRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySceneRuleResponseBody setData(QuerySceneRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySceneRuleResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySceneRuleResponseBodyDataRuleList extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleDescription")
        public String ruleDescription;

        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        public static QuerySceneRuleResponseBodyDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneRuleResponseBodyDataRuleList self = new QuerySceneRuleResponseBodyDataRuleList();
            return TeaModel.build(map, self);
        }

        public QuerySceneRuleResponseBodyDataRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QuerySceneRuleResponseBodyDataRuleList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySceneRuleResponseBodyDataRuleList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySceneRuleResponseBodyDataRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QuerySceneRuleResponseBodyDataRuleList setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public QuerySceneRuleResponseBodyDataRuleList setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

    }

    public static class QuerySceneRuleResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("RuleList")
        public java.util.List<QuerySceneRuleResponseBodyDataRuleList> ruleList;

        public static QuerySceneRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneRuleResponseBodyData self = new QuerySceneRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySceneRuleResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySceneRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySceneRuleResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySceneRuleResponseBodyData setRuleList(java.util.List<QuerySceneRuleResponseBodyDataRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<QuerySceneRuleResponseBodyDataRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
