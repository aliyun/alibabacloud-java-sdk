// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackRequest extends TeaModel {
    /**
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the compliance package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-pack-name</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    /**
     * <p>The ID of the compliance package template.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the ID of the compliance package.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-5f26ff4e06a300c4****</p>
     */
    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    /**
     * <p>The rules in the compliance package. You must specify either this parameter or TemplateContent.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigRules")
    public java.util.List<CreateCompliancePackRequestConfigRules> configRules;

    /**
     * <p>Specifies whether to enable the rule together with the compliance package. Valid values:</p>
     * <ul>
     * <li>true: The system enables the rule together with the compliance package.</li>
     * <li>false: The system does not enable the rule together with the compliance package.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultEnable")
    public Boolean defaultEnable;

    /**
     * <p>The description of the compliance package.</p>
     * 
     * <strong>example:</strong>
     * <p>Test pack description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>ExcludeRegionIdsScope</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>ExcludeResourceGroupIdsScope. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The ID of the resource that you do not want to evaluate by using the compliance package. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-8vbf3x310fn56ijfd****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>ExcludeTagsScope</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateCompliancePackRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The ID of the region whose resources you want to evaluate by using the compliance package. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The ID of the resource group whose resources you want to evaluate by using the compliance package. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzdibsjjc****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>ResourceIdsScope</p>
     * 
     * <strong>example:</strong>
     * <p>eip-8vbf3x310fn56ijfd****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Default value: 2. Valid values:</p>
     * <ul>
     * <li>1: high.</li>
     * <li>2: medium.</li>
     * <li>3: low.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCompliancePackRequestTag> tag;

    /**
     * <p>The tag key of the resource that you want to evaluate by using the compliance package.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The tag value of the resource that you want to evaluate by using the compliance package.</p>
     * <blockquote>
     * <p> You must configure the TagValueScope parameter together with the TagKeyScope parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

    /**
     * <p>TagsScope</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<CreateCompliancePackRequestTagsScope> tagsScope;

    /**
     * <p>The information about the template that is used to generate the compliance package. You can call an API operation to view the details of an existing compliance package or write a compliance package template. For more information, see <a href="https://help.aliyun.com/document_detail/2659733.html">Write a compliance package template in a configuration file</a>. You must specify one of ConfigRules and TemplateContent.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;configRuleTemplates&quot;: [ { &quot;configRuleName&quot;: &quot;condition-rule-example&quot;, &quot;scope&quot;: { &quot;complianceResourceTypes&quot;: [ &quot;ACS::ECS::Instance&quot; ] }, &quot;description&quot;: &quot;&quot;, &quot;source&quot;: { &quot;owner&quot;: &quot;CUSTOM_CONFIGURATION&quot;, &quot;identifier&quot;: &quot;acs-config-configuration&quot;, &quot;sourceDetails&quot;: [ { &quot;messageType&quot;: &quot;ScheduledNotification&quot;, &quot;maximumExecutionFrequency&quot;: &quot;Twelve_Hours&quot; }, { &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot; } ], &quot;conditions&quot;: &quot;{\\&quot;ComplianceConditions\\&quot;:\\&quot;{\\\\\&quot;operator\\\\\&quot;:\\\\\&quot;and\\\\\&quot;,\\\\\&quot;children\\\\\&quot;:[{\\\\\&quot;operator\\\\\&quot;:\\\\\&quot;GreaterOrEquals\\\\\&quot;,\\\\\&quot;featurePath\\\\\&quot;:\\\\\&quot;$.Cpu\\\\\&quot;,\\\\\&quot;featureSource\\\\\&quot;:\\\\\&quot;CONFIGURATION\\\\\&quot;,\\\\\&quot;desired\\\\\&quot;:\\\\\&quot;2\\\\\&quot;}]}\\&quot;}&quot; }, &quot;inputParameters&quot;: {} }, { &quot;configRuleName&quot;: &quot;oss-bucket-referer-limit&quot;, &quot;scope&quot;: { &quot;complianceResourceTypes&quot;: [ &quot;ACS::OSS::Bucket&quot; ] }, &quot;description&quot;: &quot;If the hotlink protection feature is enabled for the Object Storage Service (OSS) bucket and the Referer is added to a specific whitelist, the evaluation result is compliant.&quot;, &quot;source&quot;: { &quot;owner&quot;: &quot;ALIYUN&quot;, &quot;identifier&quot;: &quot;oss-bucket-referer-limit&quot;, &quot;sourceDetails&quot;: [ { &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot; } ] }, &quot;inputParameters&quot;: { &quot;allowEmptyReferer&quot;: &quot;true&quot;, &quot;allowReferers&quot;: &quot;<a href="http://www.aliyun.com">http://www.aliyun.com</a>&quot; } } ] }</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    public static CreateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompliancePackRequest self = new CreateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCompliancePackRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateCompliancePackRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateCompliancePackRequest setConfigRules(java.util.List<CreateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<CreateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public CreateCompliancePackRequest setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
        return this;
    }
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    public CreateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCompliancePackRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateCompliancePackRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateCompliancePackRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateCompliancePackRequest setExcludeTagsScope(java.util.List<CreateCompliancePackRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<CreateCompliancePackRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public CreateCompliancePackRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateCompliancePackRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateCompliancePackRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateCompliancePackRequest setTag(java.util.List<CreateCompliancePackRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCompliancePackRequestTag> getTag() {
        return this.tag;
    }

    public CreateCompliancePackRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public CreateCompliancePackRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public CreateCompliancePackRequest setTagsScope(java.util.List<CreateCompliancePackRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<CreateCompliancePackRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public CreateCompliancePackRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static class CreateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the input parameter.</p>
         * <p>You must specify both <code>ParameterName</code> and <code>ParameterValue</code> or neither of them. If the managed rule has an input parameter but no default value is specified, you must specify this parameter. You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the names of input parameters of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the input parameter.</p>
         * <p>You must specify both <code>ParameterName</code> and <code>ParameterValue</code> or neither of them. If the managed rule has an input parameter but no default value is specified, you must specify this parameter. You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the values of input parameters of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestConfigRulesConfigRuleParameters self = new CreateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public CreateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateCompliancePackRequestConfigRules extends TeaModel {
        /**
         * <p>The rule ID. If you specify this parameter, Cloud Config adds the rule that has the specified ID to the compliance package.</p>
         * <p>You need to only specify <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, Cloud Config adds a rule based on the value of <code>ConfigRuleId</code>. You can call the <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a> operation to obtain the rule ID.</p>
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
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The input parameters of the rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<CreateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the test rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the managed rule. Cloud Config automatically creates a managed rule based on the specified identifier and adds the rule to the compliance package.</p>
         * <p>You need to only specify <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, Cloud Config adds a rule based on the value of <code>ConfigRuleId</code>. You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the identifier of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
         * <ul>
         * <li>1: high.</li>
         * <li>2: medium.</li>
         * <li>3: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static CreateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestConfigRules self = new CreateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public CreateCompliancePackRequestConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public CreateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<CreateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<CreateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public CreateCompliancePackRequestConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public CreateCompliancePackRequestConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateCompliancePackRequestExcludeTagsScope extends TeaModel {
        /**
         * <p>TagKey</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>TagValue</p>
         * 
         * <strong>example:</strong>
         * <p>value-2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateCompliancePackRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestExcludeTagsScope self = new CreateCompliancePackRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateCompliancePackRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateCompliancePackRequestTag extends TeaModel {
        /**
         * <p>The tag keys.</p>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length. The tag keys cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCompliancePackRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestTag self = new CreateCompliancePackRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCompliancePackRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCompliancePackRequestTagsScope extends TeaModel {
        /**
         * <p>Tagkey</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>TagValue</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateCompliancePackRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestTagsScope self = new CreateCompliancePackRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateCompliancePackRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
