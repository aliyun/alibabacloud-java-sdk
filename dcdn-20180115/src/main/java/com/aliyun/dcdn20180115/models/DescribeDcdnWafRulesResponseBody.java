// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection rules returned per page. The value of this parameter is the same as that of the PageSize parameter in the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The time when the protection policy was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the protection policy.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The configuration information about the protection rule.</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The ID of the protection rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the protection rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the protection rule. The value of this parameter is the same as that of the RuleStatus field in QueryArgst.</p>
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
