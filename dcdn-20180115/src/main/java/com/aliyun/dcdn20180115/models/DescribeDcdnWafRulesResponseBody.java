// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection rules returned per page. The value of this parameter is the same as that of the PageSize parameter in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
    @NameInMap("Rules")
    public java.util.List<DescribeDcdnWafRulesResponseBodyRules> rules;

    /**
     * <p>The total number of protection rules.</p>
     * 
     * <strong>example:</strong>
     * <p>121</p>
     */
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
        /**
         * <p>The type of the protection policy. The value of this parameter is the same as that of the DefenseScene field in QueryArgst.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_acl</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The time when the protection policy was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
         * <p>The configuration information about the protection rule.</p>
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
         * <p>The status of the protection rule. The value of this parameter is the same as that of the RuleStatus field in QueryArgst.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
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
