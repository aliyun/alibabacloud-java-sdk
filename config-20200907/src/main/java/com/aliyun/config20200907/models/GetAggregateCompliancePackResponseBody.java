// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The details of the compliance package.</p>
     */
    @NameInMap("CompliancePack")
    public GetAggregateCompliancePackResponseBodyCompliancePack compliancePack;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackResponseBody self = new GetAggregateCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackResponseBody setCompliancePack(GetAggregateCompliancePackResponseBodyCompliancePack compliancePack) {
        this.compliancePack = compliancePack;
        return this;
    }
    public GetAggregateCompliancePackResponseBodyCompliancePack getCompliancePack() {
        return this.compliancePack;
    }

    public GetAggregateCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the input parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the input parameter.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the input parameter was required. Valid values:</p>
         * <br>
         * <p>*   true: required</p>
         * <p>*   false: optional</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters self = new GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackConfigRules extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The input parameters of the rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the managed rule.</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that were not compliant with the rule. Valid values:</p>
         * <br>
         * <p>*   1: high</p>
         * <p>*   2: medium</p>
         * <p>*   3: low</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetAggregateCompliancePackResponseBodyCompliancePackConfigRules build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackConfigRules self = new GetAggregateCompliancePackResponseBodyCompliancePackConfigRules();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleParameters(java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackScope extends TeaModel {
        /**
         * <p>The ID of the resource that is not evaluated by using the compliance package.</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The ID of the region whose resources were evaluated by using the compliance package.</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The ID of the resource group whose resources are evaluated by using the compliance package.</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The tag key of the resource that is evaluated by using the compliance package.</p>
         */
        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        /**
         * <p>The tag value of the resource that is evaluated by using the compliance package.</p>
         */
        @NameInMap("TagValueScope")
        public String tagValueScope;

        public static GetAggregateCompliancePackResponseBodyCompliancePackScope build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackScope self = new GetAggregateCompliancePackResponseBodyCompliancePackScope();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setRegionIdsScope(String regionIdsScope) {
            this.regionIdsScope = regionIdsScope;
            return this;
        }
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setResourceGroupIdsScope(String resourceGroupIdsScope) {
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setTagKeyScope(String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setTagValueScope(String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public String getTagValueScope() {
            return this.tagValueScope;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePack extends TeaModel {
        /**
         * <p>The ID of the management account to which the compliance package belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the compliance package template.</p>
         */
        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        /**
         * <p>The rules in the compliance package.</p>
         */
        @NameInMap("ConfigRules")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRules> configRules;

        /**
         * <p>The timestamp when the compliance package was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the compliance package.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:</p>
         * <br>
         * <p>*   1: high</p>
         * <p>*   2: medium</p>
         * <p>*   3: low</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The evaluation scope of the compliance package.</p>
         */
        @NameInMap("Scope")
        public GetAggregateCompliancePackResponseBodyCompliancePackScope scope;

        /**
         * <p>The status of the compliance package. Valid values:</p>
         * <br>
         * <p>*   ACTIVE: The compliance package was normal.</p>
         * <p>*   CREATING: The compliance package was being created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAggregateCompliancePackResponseBodyCompliancePack build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePack self = new GetAggregateCompliancePackResponseBodyCompliancePack();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setConfigRules(java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRules> configRules) {
            this.configRules = configRules;
            return this;
        }
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRules> getConfigRules() {
            return this.configRules;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setScope(GetAggregateCompliancePackResponseBodyCompliancePackScope scope) {
            this.scope = scope;
            return this;
        }
        public GetAggregateCompliancePackResponseBodyCompliancePackScope getScope() {
            return this.scope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
