// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigRuleShrinkRequest extends TeaModel {
    /**
     * <p>A client token. It is used to ensure the idempotence of the request. You can use the client to generate a token, but you must make sure that the token is unique among different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ComplianceConditions&quot;:&quot;{&quot;operator&quot;:&quot;and&quot;,&quot;children&quot;:[{&quot;operator&quot;:&quot;StringEquals&quot;,&quot;featurePath&quot;:&quot;$.Status&quot;,&quot;desired&quot;:&quot;1&quot;,&quot;featureSource&quot;:&quot;CONFIGURATION&quot;}]}&quot;}</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>存在所有指定标签</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The trigger that invokes the rule. Valid values:</p>
     * <ul>
     * <li><p>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
     * </li>
     * <li><p>ScheduledNotification: The rule is triggered on a regular basis.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If a rule has multiple triggers, separate them with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ConfigurationItemChangeNotification</p>
     */
    @NameInMap("ConfigRuleTriggerTypes")
    public String configRuleTriggerTypes;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>最多可以定义6组标签。如果资源同时具有指定的所有标签，则视为“合规”。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The rule does not apply to resources in the specified regions. The compliance of resources in these regions is not evaluated. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The rule does not apply to resources in the specified resource groups. The compliance of resources in these resource groups is not evaluated. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The rule does not apply to the specified resources. The compliance of these resources is not evaluated. Separate multiple resource IDs with commas (,).</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-t4nbowvtbkss7t326****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The scope of the tags to exclude.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>Extended content. This parameter is used only to specify the trigger time for a 24-hour evaluation cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fixedHour&quot;:&quot;13&quot;}</p>
     */
    @NameInMap("ExtendContent")
    public String extendContent;

    /**
     * <p>The input parameters of the rule.</p>
     * <p>You can obtain the input parameters of a rule by calling the <a href="https://help.aliyun.com/document_detail/606993.html">GetManagedRule</a> operation. View the <code>CompulsoryInputParameterDetails</code> and <code>OptionalInputParameterDetails</code> parameters to learn about the required and optional parameters.</p>
     * <p>The format of the input parameters is <code>{&quot;Parameter 1 Name&quot;:&quot;Parameter 1 Value&quot;,&quot;Parameter 2 Name&quot;:&quot;Parameter 2 Value&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}</p>
     */
    @NameInMap("InputParameters")
    public String inputParametersShrink;

    /**
     * <p>The frequency at which the rule is executed. Valid values:</p>
     * <ul>
     * <li><p>One_Hour: 1 hour.</p>
     * </li>
     * <li><p>Three_Hours: 3 hours.</p>
     * </li>
     * <li><p>Six_Hours: 6 hours.</p>
     * </li>
     * <li><p>Twelve_Hours: 12 hours.</p>
     * </li>
     * <li><p>TwentyFour_Hours (default): 24 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you set ConfigRuleTriggerTypes to ScheduledNotification.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>One_Hour</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The rule applies only to resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The rule applies only to resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The rule applies to the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The rule applies only to resources that have the specified names.</p>
     * 
     * <strong>example:</strong>
     * <p>i-xxx</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceNameScope")
    public String resourceNameScope;

    /**
     * <p>The resource types to be evaluated by the rule. Separate multiple resource types with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypesScope")
    public String resourceTypesScopeShrink;

    /**
     * <p>The risk level of the rule. Valid values:</p>
     * <ul>
     * <li><p>1: high.</p>
     * </li>
     * <li><p>2: medium.</p>
     * </li>
     * <li><p>3: low.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The identifier of the rule.</p>
     * <ul>
     * <li><p>If you set <code>SourceOwner</code> to <code>ALIYUN</code>, specify the identifier of the rule template. Example: <code>required-tags</code>.</p>
     * <blockquote>
     * <p>To query the identifier of a rule template, see <a href="https://help.aliyun.com/document_detail/127404.html">List of rule templates</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>If you set <code>SourceOwner</code> to <code>CUSTOM_FC</code>, specify the Alibaba Cloud Resource Name (ARN) of the function.</p>
     * <p>The ARN must be in the format of <code>acs:fc:{Region}:{AccountID}:services/{ServiceName}.LATEST/functions/{FunctionName}</code>. Example: <code>acs:fc:cn-hangzhou:120886317861****:services/service-test.LATEST/functions/config-test</code>.</p>
     * <blockquote>
     * <p>To obtain the ARN of a function, see <a href="https://help.aliyun.com/document_detail/415752.html">ListFunctions</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>required-tags</p>
     */
    @NameInMap("SourceIdentifier")
    public String sourceIdentifier;

    /**
     * <p>The type of the rule to create. Valid values:</p>
     * <ul>
     * <li><p>ALIYUN: rule template.</p>
     * </li>
     * <li><p>CUSTOM_FC: custom rule.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("SourceOwner")
    public String sourceOwner;

    /**
     * <p>The tags of the rule to be created.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The logical operator that applies if you specify multiple tags for the <code>TagsScope</code> parameter. For example, if you set <code>TagsScope</code> to <code>&quot;TagsScope.1.TagKey&quot;:&quot;a&quot;,&quot;TagsScope.1.TagValue&quot;:&quot;a&quot;,&quot;TagsScope.2.TagKey&quot;:&quot;b&quot;,&quot;TagsScope.2.TagValue&quot;:&quot;b&quot;</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>a:a</code> and <code>b:b</code> tags. If you do not specify this parameter, the default value <code>OR</code> is used.</p>
     * <p>This parameter also works with the deprecated <code>TagKeyScope</code> parameter. For example, if you set <code>TagKeyScope</code> to <code>ECS,OSS</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>ECS</code> and <code>OSS</code> tags.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>AND: The AND logic applies.</p>
     * </li>
     * <li><p>OR: The OR logic applies.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("TagKeyLogicScope")
    public String tagKeyLogicScope;

    /**
     * <p>This parameter is deprecated. Use the <code>TagsScope</code> parameter instead.</p>
     * <p>The rule applies only to resources that have the specified tag key.</p>
     * <blockquote>
     * <p>This parameter applies only to managed rules. You must set both <code>TagKeyScope</code> and <code>TagValueScope</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    @Deprecated
    public String tagKeyScope;

    /**
     * <p>This parameter is deprecated. Use the <code>TagsScope</code> parameter instead.</p>
     * <p>The rule applies only to resources that have the specified tag value.</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates. You must set both <code>TagKeyScope</code> and <code>TagValueScope</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    @Deprecated
    public String tagValueScope;

    /**
     * <p>The scope of the tags.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<CreateConfigRuleShrinkRequestTagsScope> tagsScope;

    public static CreateConfigRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRuleShrinkRequest self = new CreateConfigRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRuleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigRuleShrinkRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public CreateConfigRuleShrinkRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public CreateConfigRuleShrinkRequest setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
        this.configRuleTriggerTypes = configRuleTriggerTypes;
        return this;
    }
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
    }

    public CreateConfigRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigRuleShrinkRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateConfigRuleShrinkRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateConfigRuleShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateConfigRuleShrinkRequest setExcludeTagsScope(java.util.List<CreateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<CreateConfigRuleShrinkRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public CreateConfigRuleShrinkRequest setExtendContent(String extendContent) {
        this.extendContent = extendContent;
        return this;
    }
    public String getExtendContent() {
        return this.extendContent;
    }

    public CreateConfigRuleShrinkRequest setInputParametersShrink(String inputParametersShrink) {
        this.inputParametersShrink = inputParametersShrink;
        return this;
    }
    public String getInputParametersShrink() {
        return this.inputParametersShrink;
    }

    public CreateConfigRuleShrinkRequest setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    public CreateConfigRuleShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateConfigRuleShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateConfigRuleShrinkRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateConfigRuleShrinkRequest setResourceNameScope(String resourceNameScope) {
        this.resourceNameScope = resourceNameScope;
        return this;
    }
    public String getResourceNameScope() {
        return this.resourceNameScope;
    }

    public CreateConfigRuleShrinkRequest setResourceTypesScopeShrink(String resourceTypesScopeShrink) {
        this.resourceTypesScopeShrink = resourceTypesScopeShrink;
        return this;
    }
    public String getResourceTypesScopeShrink() {
        return this.resourceTypesScopeShrink;
    }

    public CreateConfigRuleShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateConfigRuleShrinkRequest setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public CreateConfigRuleShrinkRequest setSourceOwner(String sourceOwner) {
        this.sourceOwner = sourceOwner;
        return this;
    }
    public String getSourceOwner() {
        return this.sourceOwner;
    }

    public CreateConfigRuleShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateConfigRuleShrinkRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    @Deprecated
    public CreateConfigRuleShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    @Deprecated
    public CreateConfigRuleShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public CreateConfigRuleShrinkRequest setTagsScope(java.util.List<CreateConfigRuleShrinkRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<CreateConfigRuleShrinkRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class CreateConfigRuleShrinkRequestExcludeTagsScope extends TeaModel {
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

        public static CreateConfigRuleShrinkRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigRuleShrinkRequestExcludeTagsScope self = new CreateConfigRuleShrinkRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateConfigRuleShrinkRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateConfigRuleShrinkRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateConfigRuleShrinkRequestTagsScope extends TeaModel {
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

        public static CreateConfigRuleShrinkRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigRuleShrinkRequestTagsScope self = new CreateConfigRuleShrinkRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateConfigRuleShrinkRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateConfigRuleShrinkRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
