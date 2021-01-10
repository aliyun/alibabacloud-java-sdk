// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceSceneRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryEdgeInstanceSceneRuleResponseBodyData data;

    public static QueryEdgeInstanceSceneRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceSceneRuleResponseBody self = new QueryEdgeInstanceSceneRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceSceneRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceSceneRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceSceneRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceSceneRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceSceneRuleResponseBody setData(QueryEdgeInstanceSceneRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceSceneRuleResponseBodyData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceSceneRuleResponseBodyDataRuleList extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("IsExisted")
        public Integer isExisted;

        public static QueryEdgeInstanceSceneRuleResponseBodyDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceSceneRuleResponseBodyDataRuleList self = new QueryEdgeInstanceSceneRuleResponseBodyDataRuleList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceSceneRuleResponseBodyDataRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyDataRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyDataRuleList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyDataRuleList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyDataRuleList setIsExisted(Integer isExisted) {
            this.isExisted = isExisted;
            return this;
        }
        public Integer getIsExisted() {
            return this.isExisted;
        }

    }

    public static class QueryEdgeInstanceSceneRuleResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("RuleList")
        public java.util.List<QueryEdgeInstanceSceneRuleResponseBodyDataRuleList> ruleList;

        public static QueryEdgeInstanceSceneRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceSceneRuleResponseBodyData self = new QueryEdgeInstanceSceneRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceSceneRuleResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceSceneRuleResponseBodyData setRuleList(java.util.List<QueryEdgeInstanceSceneRuleResponseBodyDataRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceSceneRuleResponseBodyDataRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
