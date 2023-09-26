// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeRulesByApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public DescribeRulesByApiResponseBodyRules rules;

    public static DescribeRulesByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesByApiResponseBody self = new DescribeRulesByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRulesByApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRulesByApiResponseBody setRules(DescribeRulesByApiResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeRulesByApiResponseBodyRules getRules() {
        return this.rules;
    }

    public static class DescribeRulesByApiResponseBodyRulesRule extends TeaModel {
        @NameInMap("CreatedTime")
        public Integer createdTime;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeRulesByApiResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesByApiResponseBodyRulesRule self = new DescribeRulesByApiResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRulesByApiResponseBodyRulesRule setCreatedTime(Integer createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Integer getCreatedTime() {
            return this.createdTime;
        }

        public DescribeRulesByApiResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRulesByApiResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRulesByApiResponseBodyRulesRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class DescribeRulesByApiResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRulesByApiResponseBodyRulesRule> rule;

        public static DescribeRulesByApiResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesByApiResponseBodyRules self = new DescribeRulesByApiResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRulesByApiResponseBodyRules setRule(java.util.List<DescribeRulesByApiResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRulesByApiResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

}
