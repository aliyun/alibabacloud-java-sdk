// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance package.</p>
     */
    @NameInMap("CompliancePack")
    public GetCompliancePackResponseBodyCompliancePack compliancePack;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackResponseBody self = new GetCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackResponseBody setCompliancePack(GetCompliancePackResponseBodyCompliancePack compliancePack) {
        this.compliancePack = compliancePack;
        return this;
    }
    public GetCompliancePackResponseBodyCompliancePack getCompliancePack() {
        return this.compliancePack;
    }

    public GetCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the parameter is required for the rule. Valid values:</p>
         * <ul>
         * <li><p>true: The parameter is required.</p>
         * </li>
         * <li><p>false: The parameter is not required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters self = new GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePackConfigRules extends TeaModel {
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
         * <p>弹性IP实例带宽满足最低要求</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The information about the rule parameters.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>弹性IP实例可用带宽大于等于指定参数值，视为“合规”。默认值：10 MB。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The types of resources that are evaluated by the rule. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::EIP::EipAddress</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><p>1: high risk.</p>
         * </li>
         * <li><p>2: medium risk.</p>
         * </li>
         * <li><p>3: low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetCompliancePackResponseBodyCompliancePackConfigRules build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackConfigRules self = new GetCompliancePackResponseBodyCompliancePackConfigRules();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleParameters(java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope self = new GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePackScopeTagsScope extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetCompliancePackResponseBodyCompliancePackScopeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackScopeTagsScope self = new GetCompliancePackResponseBodyCompliancePackScopeTagsScope();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackScopeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetCompliancePackResponseBodyCompliancePackScopeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePackScope extends TeaModel {
        /**
         * <p>The IDs of the regions from which resources are excluded. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The compliance package is not effective for the resources in the resource groups with the specified IDs. Separate multiple resource group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc7r7rhx****</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The compliance package is not effective for the resources with the specified IDs. The resources are not evaluated.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The excluded tag scope.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ExcludeTagsScope")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope> excludeTagsScope;

        /**
         * <p>The compliance package is effective only for resources in the specified regions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The compliance package is effective only for the resources in the resource groups with the specified IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc7r7rhx****</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The compliance package is effective only for resources with the specified IDs. Separate multiple resource IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The compliance package is effective only for the resources that have the specified tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        /**
         * <p>The compliance package is effective only for the resources that have the specified tag key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValueScope")
        public String tagValueScope;

        /**
         * <p>The tag scope.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TagsScope")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackScopeTagsScope> tagsScope;

        public static GetCompliancePackResponseBodyCompliancePackScope build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackScope self = new GetCompliancePackResponseBodyCompliancePackScope();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackScope setExcludeRegionIdsScope(String excludeRegionIdsScope) {
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setExcludeTagsScope(java.util.List<GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope> excludeTagsScope) {
            this.excludeTagsScope = excludeTagsScope;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackScopeExcludeTagsScope> getExcludeTagsScope() {
            return this.excludeTagsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setRegionIdsScope(String regionIdsScope) {
            this.regionIdsScope = regionIdsScope;
            return this;
        }
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setResourceGroupIdsScope(String resourceGroupIdsScope) {
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setResourceIdsScope(String resourceIdsScope) {
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setTagKeyScope(String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setTagValueScope(String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public String getTagValueScope() {
            return this.tagValueScope;
        }

        public GetCompliancePackResponseBodyCompliancePackScope setTagsScope(java.util.List<GetCompliancePackResponseBodyCompliancePackScopeTagsScope> tagsScope) {
            this.tagsScope = tagsScope;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackScopeTagsScope> getTagsScope() {
            return this.tagsScope;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePackTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetCompliancePackResponseBodyCompliancePackTags build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackTags self = new GetCompliancePackResponseBodyCompliancePackTags();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetCompliancePackResponseBodyCompliancePackTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePack extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the compliance package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The compliance package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-a8a8626622af0082****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>等保三级预检合规包</p>
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
         * <p>The list of rules in the compliance package.</p>
         */
        @NameInMap("ConfigRules")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRules> configRules;

        /**
         * <p>The timestamp when the compliance package was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624245766000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>基于等保2.0三级标准，提供持续检测合规性的建议模板，帮助您提前自检并修复问题，以便快速通过正式检测。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the compliance package. Valid values:</p>
         * <ul>
         * <li><p>1: high risk.</p>
         * </li>
         * <li><p>2: medium risk.</p>
         * </li>
         * <li><p>3: low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The evaluation scope.</p>
         */
        @NameInMap("Scope")
        public GetCompliancePackResponseBodyCompliancePackScope scope;

        /**
         * <p>The status of the compliance package. Valid values:</p>
         * <ul>
         * <li><p>ACTIVE: The compliance package is active.</p>
         * </li>
         * <li><p>CREATING: The compliance package is being created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackTags> tags;

        /**
         * <p>The template information for the compliance package. The rule list in the template does not include user-defined function rules. You can use this template to quickly create the same compliance package for other accounts or account groups.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;configRuleTemplates&quot;: [
         *         {
         *             &quot;configRuleName&quot;: &quot;自定义条件规则示例&quot;,
         *             &quot;scope&quot;: {
         *                 &quot;complianceResourceTypes&quot;: [
         *                     &quot;ACS::ECS::Instance&quot;
         *                 ]
         *             },
         *             &quot;description&quot;: &quot;&quot;,
         *             &quot;source&quot;: {
         *                 &quot;owner&quot;: &quot;CUSTOM_CONFIGURATION&quot;,
         *                 &quot;identifier&quot;: &quot;acs-config-configuration&quot;,
         *                 &quot;sourceDetails&quot;: [
         *                     {
         *                         &quot;messageType&quot;: &quot;ScheduledNotification&quot;,
         *                         &quot;maximumExecutionFrequency&quot;: &quot;Twelve_Hours&quot;
         *                     },
         *                     {
         *                         &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
         *                     }
         *                 ],
         *                 &quot;conditions&quot;: &quot;{\&quot;ComplianceConditions\&quot;:\&quot;{\\\&quot;operator\\\&quot;:\\\&quot;and\\\&quot;,\\\&quot;children\\\&quot;:[{\\\&quot;operator\\\&quot;:\\\&quot;GreaterOrEquals\\\&quot;,\\\&quot;featurePath\\\&quot;:\\\&quot;$.Cpu\\\&quot;,\\\&quot;featureSource\\\&quot;:\\\&quot;CONFIGURATION\\\&quot;,\\\&quot;desired\\\&quot;:\\\&quot;2\\\&quot;}]}\&quot;}&quot;
         *             },
         *             &quot;inputParameters&quot;: {}
         *         },
         *         {
         *             &quot;configRuleName&quot;: &quot;OSS存储空间Referer在指定的防盗链白名单中&quot;,
         *             &quot;scope&quot;: {
         *                 &quot;complianceResourceTypes&quot;: [
         *                     &quot;ACS::OSS::Bucket&quot;
         *                 ]
         *             },
         *             &quot;description&quot;: &quot;OSS存储空间开启防盗链并且Referer在指定白名单中，视为“合规”。&quot;,
         *             &quot;source&quot;: {
         *                 &quot;owner&quot;: &quot;ALIYUN&quot;,
         *                 &quot;identifier&quot;: &quot;oss-bucket-referer-limit&quot;,
         *                 &quot;sourceDetails&quot;: [
         *                     {
         *                         &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
         *                     }
         *                 ]
         *             },
         *             &quot;inputParameters&quot;: {
         *                 &quot;allowEmptyReferer&quot;: &quot;true&quot;,
         *                 &quot;allowReferers&quot;: &quot;<a href="http://www.aliyun.com">http://www.aliyun.com</a>&quot;
         *             }
         *         }
         *     ]
         * }</p>
         */
        @NameInMap("TemplateContent")
        public String templateContent;

        public static GetCompliancePackResponseBodyCompliancePack build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePack self = new GetCompliancePackResponseBodyCompliancePack();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePack setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetCompliancePackResponseBodyCompliancePack setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetCompliancePackResponseBodyCompliancePack setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public GetCompliancePackResponseBodyCompliancePack setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public GetCompliancePackResponseBodyCompliancePack setConfigRules(java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRules> configRules) {
            this.configRules = configRules;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRules> getConfigRules() {
            return this.configRules;
        }

        public GetCompliancePackResponseBodyCompliancePack setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetCompliancePackResponseBodyCompliancePack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCompliancePackResponseBodyCompliancePack setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetCompliancePackResponseBodyCompliancePack setScope(GetCompliancePackResponseBodyCompliancePackScope scope) {
            this.scope = scope;
            return this;
        }
        public GetCompliancePackResponseBodyCompliancePackScope getScope() {
            return this.scope;
        }

        public GetCompliancePackResponseBodyCompliancePack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCompliancePackResponseBodyCompliancePack setTags(java.util.List<GetCompliancePackResponseBodyCompliancePackTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackTags> getTags() {
            return this.tags;
        }

        public GetCompliancePackResponseBodyCompliancePack setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

    }

}
