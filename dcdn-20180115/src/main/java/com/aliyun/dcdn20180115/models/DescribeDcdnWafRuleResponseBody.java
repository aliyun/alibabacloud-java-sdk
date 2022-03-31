// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rule")
    public DescribeDcdnWafRuleResponseBodyRule rule;

    public static DescribeDcdnWafRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafRuleResponseBody self = new DescribeDcdnWafRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafRuleResponseBody setRule(DescribeDcdnWafRuleResponseBodyRule rule) {
        this.rule = rule;
        return this;
    }
    public DescribeDcdnWafRuleResponseBodyRule getRule() {
        return this.rule;
    }

    public static class DescribeDcdnWafRuleResponseBodyRule extends TeaModel {
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

        public static DescribeDcdnWafRuleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafRuleResponseBodyRule self = new DescribeDcdnWafRuleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafRuleResponseBodyRule setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafRuleResponseBodyRule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnWafRuleResponseBodyRule setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeDcdnWafRuleResponseBodyRule setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public DescribeDcdnWafRuleResponseBodyRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDcdnWafRuleResponseBodyRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDcdnWafRuleResponseBodyRule setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
