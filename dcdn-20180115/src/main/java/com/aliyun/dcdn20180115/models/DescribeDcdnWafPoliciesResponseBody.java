// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPoliciesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Valid values: **1** to **100000**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection policies returned per page. Valid values: an integer from **1** to **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information about protection policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeDcdnWafPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of protection policies.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPoliciesResponseBody self = new DescribeDcdnWafPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafPoliciesResponseBody setPolicies(java.util.List<DescribeDcdnWafPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeDcdnWafPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribeDcdnWafPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The type of the protection policy, which is the same as the DefenseScenes field in the QueryArgs parameter.</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The number of domain names that use the protection policy.</p>
         */
        @NameInMap("DomainCount")
        public Integer domainCount;

        /**
         * <p>The time when the protection policy was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the protection policy.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The name of the protection policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The status of the protection policy, which is the same as the PolicyStatus field in the QueryArgs parameter.</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>Indicates whether this protection policy is the default policy, which is the same as the PolicyType field in the QueryArgs parameter.</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The number of protection rules in the protection policy.</p>
         */
        @NameInMap("RuleCount")
        public Long ruleCount;

        public static DescribeDcdnWafPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafPoliciesResponseBodyPolicies self = new DescribeDcdnWafPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setDomainCount(Integer domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Integer getDomainCount() {
            return this.domainCount;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DescribeDcdnWafPoliciesResponseBodyPolicies setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

    }

}
