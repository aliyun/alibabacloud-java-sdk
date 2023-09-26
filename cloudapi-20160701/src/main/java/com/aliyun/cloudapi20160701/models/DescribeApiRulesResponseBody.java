// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiRulesResponseBody extends TeaModel {
    @NameInMap("ApiRules")
    public DescribeApiRulesResponseBodyApiRules apiRules;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiRulesResponseBody self = new DescribeApiRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiRulesResponseBody setApiRules(DescribeApiRulesResponseBodyApiRules apiRules) {
        this.apiRules = apiRules;
        return this;
    }
    public DescribeApiRulesResponseBodyApiRules getApiRules() {
        return this.apiRules;
    }

    public DescribeApiRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiRulesResponseBodyApiRulesApiRule extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeApiRulesResponseBodyApiRulesApiRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiRulesResponseBodyApiRulesApiRule self = new DescribeApiRulesResponseBodyApiRulesApiRule();
            return TeaModel.build(map, self);
        }

        public DescribeApiRulesResponseBodyApiRulesApiRule setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiRulesResponseBodyApiRulesApiRule setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiRulesResponseBodyApiRulesApiRule setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApiRulesResponseBodyApiRulesApiRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeApiRulesResponseBodyApiRulesApiRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeApiRulesResponseBodyApiRulesApiRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class DescribeApiRulesResponseBodyApiRules extends TeaModel {
        @NameInMap("ApiRule")
        public java.util.List<DescribeApiRulesResponseBodyApiRulesApiRule> apiRule;

        public static DescribeApiRulesResponseBodyApiRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiRulesResponseBodyApiRules self = new DescribeApiRulesResponseBodyApiRules();
            return TeaModel.build(map, self);
        }

        public DescribeApiRulesResponseBodyApiRules setApiRule(java.util.List<DescribeApiRulesResponseBodyApiRulesApiRule> apiRule) {
            this.apiRule = apiRule;
            return this;
        }
        public java.util.List<DescribeApiRulesResponseBodyApiRulesApiRule> getApiRule() {
            return this.apiRule;
        }

    }

}
