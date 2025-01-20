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
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
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
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the input parameter was required. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-a260626622af0005****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The details of the input parameter of the rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The type of the resource evaluated based on the rule. Multiple resource types are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::EIP::EipAddress</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    public static class GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value-2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope self = new GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope self = new GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackScope extends TeaModel {
        /**
         * <p>The IDs of regions that are excluded. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The IDs of the resource groups whose resources you do not want to evaluate by using the compliance package. Separate multiple resource group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc7r7rhx****</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The ID of the resource that is not evaluated by using the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The scope of the tag that is excluded.</p>
         */
        @NameInMap("ExcludeTagsScope")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope> excludeTagsScope;

        /**
         * <p>The ID of the region whose resources were evaluated by using the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The ID of the resource group whose resources are evaluated by using the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc7r7rhx****</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The IDs of the resources to which the rule applies. Separate multiple resource IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The tag key of the resource that is evaluated by using the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        /**
         * <p>The tag value of the resource that is evaluated by using the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValueScope")
        public String tagValueScope;

        /**
         * <p>The tag scope.</p>
         */
        @NameInMap("TagsScope")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope> tagsScope;

        public static GetAggregateCompliancePackResponseBodyCompliancePackScope build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackScope self = new GetAggregateCompliancePackResponseBodyCompliancePackScope();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setExcludeRegionIdsScope(String excludeRegionIdsScope) {
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setExcludeTagsScope(java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope> excludeTagsScope) {
            this.excludeTagsScope = excludeTagsScope;
            return this;
        }
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope> getExcludeTagsScope() {
            return this.excludeTagsScope;
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

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setResourceIdsScope(String resourceIdsScope) {
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
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

        public GetAggregateCompliancePackResponseBodyCompliancePackScope setTagsScope(java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope> tagsScope) {
            this.tagsScope = tagsScope;
            return this;
        }
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackScopeTagsScope> getTagsScope() {
            return this.tagsScope;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePack extends TeaModel {
        /**
         * <p>The ID of the management account to which the compliance package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the compliance package template.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-5f26ff4e06a300c4****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1624243657000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the compliance package.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <ul>
         * <li>ACTIVE: The compliance package was normal.</li>
         * <li>CREATING: The compliance package was being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about the current compliance package template. The rules in the template do not contain custom function rules. You can quickly create the same compliance package for other accounts or account groups based on the template information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;configRuleTemplates&quot;: [
         *     {
         *       &quot;configRuleName&quot;: &quot;OSS-test-name&quot;,
         *       &quot;scope&quot;: {
         *         &quot;complianceResourceTypes&quot;: [
         *           &quot;ACS::OSS::Bucket&quot;
         *         ]
         *       },
         *       &quot;description&quot;: &quot;test-description&quot;,
         *       &quot;source&quot;: {
         *         &quot;owner&quot;: &quot;ALIYUN&quot;,
         *         &quot;identifier&quot;: &quot;oss-bucket-referer-xxx&quot;,
         *         &quot;sourceDetails&quot;: [
         *           {
         *             &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
         *           }
         *         ]
         *       },
         *       &quot;inputParameters&quot;: {
         *         &quot;allowEmptyReferer&quot;: &quot;true&quot;,
         *         &quot;allowReferers&quot;: &quot;<a href="http://www.aliyun.com">http://www.aliyun.com</a>&quot;
         *       }
         *     }
         *   ]
         * }</p>
         */
        @NameInMap("TemplateContent")
        public String templateContent;

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

        public GetAggregateCompliancePackResponseBodyCompliancePack setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

    }

}
