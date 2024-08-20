// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the protection policy.</p>
     */
    @NameInMap("Policy")
    public DescribeDcdnWafPolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
     */
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
        /**
         * <p>The type of the protection policy. Valid values:</p>
         * <ul>
         * <li>waf_group: basic web protection</li>
         * <li>custom_acl: custom protection</li>
         * <li>whitelist: whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The number of domain names that use the protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DomainCount")
        public Integer domainCount;

        /**
         * <p>The time when the protection policy was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T17:08:45Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The name of the protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The status of the protection policy. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>Indicates whether the current policy is the default policy. Valid values:</p>
         * <ul>
         * <li>default</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The protection rule configurations corresponding to the protection policy. The configurations only support Bot management. For more information, see <a href="~~BatchCreateDcdnWafRules~~">BatchCreateDcdnWafRules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;type&quot;:&quot;target_type&quot;,     &quot;status&quot;:&quot;on&quot;,     &quot;config&quot;:{&quot;target&quot;:&quot;app&quot;},     &quot;action&quot;:&quot;&quot;   }</p>
         */
        @NameInMap("RuleConfigs")
        public String ruleConfigs;

        /**
         * <p>The number of protection rules in the protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
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

        public DescribeDcdnWafPolicyResponseBodyPolicy setRuleConfigs(String ruleConfigs) {
            this.ruleConfigs = ruleConfigs;
            return this;
        }
        public String getRuleConfigs() {
            return this.ruleConfigs;
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
