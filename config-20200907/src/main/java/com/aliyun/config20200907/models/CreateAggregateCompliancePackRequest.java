// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-f632626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>A client token. It is used to ensure the idempotence of the request. Generate a value from your client to make sure that the value is unique among different requests. <code>ClientToken</code> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the compliance pack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>等保三级预检合规包</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    /**
     * <p>The ID of the compliance pack template.</p>
     * <p>For more information about how to obtain the ID of a compliance pack template, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-5f26ff4e06a300c4****</p>
     */
    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    /**
     * <p>The rules in the compliance pack.</p>
     * <blockquote>
     * <p>Specify either this parameter or <code>TemplateContent</code>.</p>
     * </blockquote>
     */
    @NameInMap("ConfigRules")
    public java.util.List<CreateAggregateCompliancePackRequestConfigRules> configRules;

    /**
     * <p>Indicates whether the rule is enabled for quick activation. Valid values:</p>
     * <ul>
     * <li><p>true: The rule is enabled when you quickly activate the compliance pack.</p>
     * </li>
     * <li><p>false (default): The rule is not enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultEnable")
    public Boolean defaultEnable;

    /**
     * <p>The description of the compliance pack.</p>
     * 
     * <strong>example:</strong>
     * <p>基于等保三级的部分要求，对阿里云上资源的合规性做检测。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The compliance pack does not take effect for resources in the specified regions. The resources in these regions are not evaluated. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The compliance pack does not take effect for resources in the specified resource groups. The resources in these resource groups are not evaluated. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The compliance pack does not take effect for the specified resources. The resources are not evaluated. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-8vbf3x310fn56ijfd****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The excluded tags.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateAggregateCompliancePackRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The compliance pack takes effect only for resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The compliance pack takes effect only for resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The compliance pack takes effect only for the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The risk level of the compliance pack. Valid values:</p>
     * <ul>
     * <li><p>1: High</p>
     * </li>
     * <li><p>2 (default): Medium</p>
     * </li>
     * <li><p>3: Low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAggregateCompliancePackRequestTag> tag;

    /**
     * <p>The compliance pack takes effect only for resources that have the specified tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The compliance pack takes effect only for resources that have the specified tag key-value pair.</p>
     * <blockquote>
     * <p>TagValueScope must be used with TagKeyScope.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

    /**
     * <p>The effective tags.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<CreateAggregateCompliancePackRequestTagsScope> tagsScope;

    /**
     * <p>The template information that is used to generate the compliance pack. You can view the template content in the details of an existing compliance pack or create a template. For more information, see <a href="https://help.aliyun.com/document_detail/2659733.html">Create a configurable compliance pack template</a>.</p>
     * <blockquote>
     * <p>Specify either this parameter or <code>ConfigRules</code>.</p>
     * </blockquote>
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

    public static CreateAggregateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateCompliancePackRequest self = new CreateAggregateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregateCompliancePackRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateAggregateCompliancePackRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateAggregateCompliancePackRequest setConfigRules(java.util.List<CreateAggregateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public CreateAggregateCompliancePackRequest setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
        return this;
    }
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    public CreateAggregateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregateCompliancePackRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateAggregateCompliancePackRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateAggregateCompliancePackRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateAggregateCompliancePackRequest setExcludeTagsScope(java.util.List<CreateAggregateCompliancePackRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public CreateAggregateCompliancePackRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateAggregateCompliancePackRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateAggregateCompliancePackRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateAggregateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateAggregateCompliancePackRequest setTag(java.util.List<CreateAggregateCompliancePackRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackRequestTag> getTag() {
        return this.tag;
    }

    public CreateAggregateCompliancePackRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public CreateAggregateCompliancePackRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public CreateAggregateCompliancePackRequest setTagsScope(java.util.List<CreateAggregateCompliancePackRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public CreateAggregateCompliancePackRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static class CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the rule parameter.</p>
         * <p>Specify both <code>ParameterName</code> and <code>ParameterValue</code>, or leave both empty. If a rule template has a parameter that does not have a default value, the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the rule parameter.</p>
         * <p>Specify both <code>ParameterName</code> and <code>ParameterValue</code>, or leave both empty. If a rule template has a parameter that does not have a default value, the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters self = new CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateAggregateCompliancePackRequestConfigRules extends TeaModel {
        /**
         * <p>The rule ID. CloudConfig adds an existing rule to the compliance pack.</p>
         * <p>Specify either <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If both parameters are specified, <code>ConfigRuleId</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-e918626622af000f****</p>
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
         * <p>The parameters of the rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>弹性公网已绑定到ECS或者NAT实例，非闲置状态，视为“合规”。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the rule template. CloudConfig automatically creates a rule based on the rule template identifier and adds the rule to the compliance pack.</p>
         * <p>Specify either <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If both parameters are specified, <code>ConfigRuleId</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><p>1: High</p>
         * </li>
         * <li><p>2: Medium</p>
         * </li>
         * <li><p>3: Low</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static CreateAggregateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestConfigRules self = new CreateAggregateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public CreateAggregateCompliancePackRequestConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public CreateAggregateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public CreateAggregateCompliancePackRequestConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAggregateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public CreateAggregateCompliancePackRequestConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateAggregateCompliancePackRequestExcludeTagsScope extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAggregateCompliancePackRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestExcludeTagsScope self = new CreateAggregateCompliancePackRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAggregateCompliancePackRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateAggregateCompliancePackRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>You can add up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>You can add up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAggregateCompliancePackRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestTag self = new CreateAggregateCompliancePackRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAggregateCompliancePackRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAggregateCompliancePackRequestTagsScope extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAggregateCompliancePackRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestTagsScope self = new CreateAggregateCompliancePackRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAggregateCompliancePackRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
