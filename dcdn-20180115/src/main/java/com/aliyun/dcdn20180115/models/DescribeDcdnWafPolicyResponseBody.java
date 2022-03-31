// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public DescribeDcdnWafPolicyResponseBodyPolicy policy;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyResponseBody self = new DescribeDcdnWafPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyResponseBody setPolicy(DescribeDcdnWafPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public DescribeDcdnWafPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public DescribeDcdnWafPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafPolicyResponseBodyPolicy extends TeaModel {
        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("DomainCount")
        public Integer domainCount;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyStatus")
        public String policyStatus;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("RuleCount")
        public Long ruleCount;

        public static DescribeDcdnWafPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafPolicyResponseBodyPolicy self = new DescribeDcdnWafPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setDomainCount(Integer domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Integer getDomainCount() {
            return this.domainCount;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DescribeDcdnWafPolicyResponseBodyPolicy setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

    }

}
