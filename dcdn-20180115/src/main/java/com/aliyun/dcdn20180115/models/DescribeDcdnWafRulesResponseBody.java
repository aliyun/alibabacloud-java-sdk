// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeDcdnWafRulesResponseBodyRules> rules;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafRulesResponseBody self = new DescribeDcdnWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafRulesResponseBody setRules(java.util.List<DescribeDcdnWafRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeDcdnWafRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeDcdnWafRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafRulesResponseBodyRules extends TeaModel {
        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("RuleConfig")
        public String ruleConfig;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleStatus")
        public String ruleStatus;

        public static DescribeDcdnWafRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafRulesResponseBodyRules self = new DescribeDcdnWafRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafRulesResponseBodyRules setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafRulesResponseBodyRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnWafRulesResponseBodyRules setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeDcdnWafRulesResponseBodyRules setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public DescribeDcdnWafRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDcdnWafRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDcdnWafRulesResponseBodyRules setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
