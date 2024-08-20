// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the protection rule.</p>
     */
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
        /**
         * <p>The type of the protection policy. Valid values:</p>
         * <ul>
         * <li>waf_group: basic web protection</li>
         * <li>custom_acl: custom protection</li>
         * <li>whitelist: IP address whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom_acl</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The time when the scaling group was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
         * <p>200001</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The configurations of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;action\&quot;:\&quot;monitor\&quot;,\&quot;actionExternal\&quot;:\&quot;{}\&quot;,\&quot;ccStatus\&quot;:1,\&quot;conditions\&quot;:[{\&quot;key\&quot;:\&quot;URL\&quot;,\&quot;opValue\&quot;:\&quot;eq\&quot;,\&quot;targetKey\&quot;:\&quot;request_uri\&quot;,\&quot;values\&quot;:\&quot;/example\&quot;},{\&quot;key\&quot;:\&quot;Header\&quot;,\&quot;opValue\&quot;:\&quot;eq\&quot;,\&quot;subKey\&quot;:\&quot;trt\&quot;,\&quot;targetKey\&quot;:\&quot;header.trt\&quot;,\&quot;values\&quot;:\&quot;3333\&quot;}],\&quot;effect\&quot;:\&quot;service\&quot;,\&quot;name\&quot;:\&quot;aaa333\&quot;,\&quot;origin\&quot;:\&quot;custom\&quot;,\&quot;ratelimit\&quot;:{\&quot;interval\&quot;:5,\&quot;status\&quot;:{\&quot;code\&quot;:404,\&quot;count\&quot;:2,\&quot;stat\&quot;:{\&quot;mode\&quot;:\&quot;count\&quot;,\&quot;value\&quot;:2.0}},\&quot;target\&quot;:\&quot;remote_addr\&quot;,\&quot;threshold\&quot;:2,\&quot;ttl\&quot;:1800}}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The ID of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the protection rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
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
