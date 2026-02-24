// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigRuleRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request. You can use a client to generate the token, but you must make sure that the token is unique for different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot be more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ComplianceConditions&quot;:&quot;{&quot;operator&quot;:&quot;and&quot;,&quot;children&quot;:[{&quot;operator&quot;:&quot;StringEquals&quot;,&quot;featurePath&quot;:&quot;$.Status&quot;,&quot;desired&quot;:&quot;1&quot;,&quot;featureSource&quot;:&quot;CONFIGURATION&quot;}]}&quot;}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The rule ID.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-a260626622af0005****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The name of the rule.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>存在所有指定标签</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The trigger type of the rule. Valid values:</p>
     * <ul>
     * <li><p>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
     * </li>
     * <li><p>ScheduledNotification: The rule is triggered on a regular basis.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter can be modified only for custom rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ConfigurationItemChangeNotification</p>
     */
    @NameInMap("ConfigRuleTriggerTypes")
    public String configRuleTriggerTypes;

    /**
     * <p>The description of the rule. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>最多可以定义6组标签。如果资源同时具有指定的所有标签，则视为“合规”。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The regions where the rule is not effective. The system does not evaluate resources in these regions. To specify multiple region IDs, separate them with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The resource groups where the rule is not effective. The system does not evaluate resources in these resource groups. To specify multiple resource group IDs, separate them with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The resources that are not evaluated by the rule. The system does not evaluate these resources. To specify multiple resource IDs, separate them with a comma (,).</p>
     * <blockquote>
     * <p>This parameter applies only to managed rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-t4nbowvtbkss7t326****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The tags that are used to exclude resources.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<UpdateConfigRuleRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The extended content. This parameter is optional. You can use this parameter with a 24-hour trigger period to set the trigger time.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExtendContent")
    public String extendContent;

    /**
     * <p>The input parameters of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("InputParameters")
    public java.util.Map<String, ?> inputParameters;

    /**
     * <p>The frequency at which the rule is run. Valid values:</p>
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
     * <p>This parameter is required when <code>ConfigRuleTriggerTypes</code> is set to <code>ScheduledNotification</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>One_Hour</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The regions where the rule is effective. The rule evaluates only resources in these regions. To specify multiple region IDs, separate them with a comma (,).</p>
     * <blockquote>
     * <p>This parameter applies only to managed rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The resource groups where the rule is effective. The rule evaluates only resources in these resource groups. To specify multiple resource group IDs, separate them with a comma (,).</p>
     * <blockquote>
     * <p>This parameter applies only to managed rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The resources that the rule evaluates. To specify multiple resource IDs, separate them with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The names of the resources that the rule evaluates.</p>
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
     * <p>The resource types that the rule evaluates. To specify multiple resource types, separate them with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypesScope")
    public java.util.List<String> resourceTypesScope;

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
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource. This parameter is deprecated. The value that you specify for this parameter does not take effect.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<UpdateConfigRuleRequestTag> tag;

    /**
     * <p>The logical relationship for the tags that you specify for the <code>TagsScope</code> parameter. For example, if you set the <code>TagsScope</code> parameter to <code>&quot;TagsScope.1.TagKey&quot;:&quot;a&quot;,&quot;TagsScope.1.TagValue&quot;:&quot;a&quot;,&quot;TagsScope.2.TagKey&quot;:&quot;b&quot;,&quot;TagsScope.2.TagValue&quot;:&quot;b&quot;</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>a:a</code> and <code>b:b</code> tags. If you do not specify this parameter, the <code>OR</code> logic is used by default.</p>
     * <p>This parameter also applies to the deprecated <code>TagKeyScope</code> parameter, but this is not recommended. For example, if you set the <code>TagKeyScope</code> parameter to <code>ECS,OSS</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>ECS</code> and <code>OSS</code> tags.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>AND</p>
     * </li>
     * <li><p>OR</p>
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
     * <p>The rule is effective only for resources that have the specified tag.</p>
     * <blockquote>
     * <p>This parameter applies only to managed rules. The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters must be specified at the same time.</p>
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
     * <p>The rule is effective only for resources that have the specified tag.</p>
     * <blockquote>
     * <p>This parameter applies only to managed rules. The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters must be specified at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    @Deprecated
    public String tagValueScope;

    /**
     * <p>The tags that are used to filter resources.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<UpdateConfigRuleRequestTagsScope> tagsScope;

    public static UpdateConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRuleRequest self = new UpdateConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateConfigRuleRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public UpdateConfigRuleRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public UpdateConfigRuleRequest setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
        this.configRuleTriggerTypes = configRuleTriggerTypes;
        return this;
    }
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
    }

    public UpdateConfigRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConfigRuleRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateConfigRuleRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateConfigRuleRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateConfigRuleRequest setExcludeTagsScope(java.util.List<UpdateConfigRuleRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<UpdateConfigRuleRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public UpdateConfigRuleRequest setExtendContent(String extendContent) {
        this.extendContent = extendContent;
        return this;
    }
    public String getExtendContent() {
        return this.extendContent;
    }

    public UpdateConfigRuleRequest setInputParameters(java.util.Map<String, ?> inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public java.util.Map<String, ?> getInputParameters() {
        return this.inputParameters;
    }

    public UpdateConfigRuleRequest setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    public UpdateConfigRuleRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateConfigRuleRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateConfigRuleRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateConfigRuleRequest setResourceNameScope(String resourceNameScope) {
        this.resourceNameScope = resourceNameScope;
        return this;
    }
    public String getResourceNameScope() {
        return this.resourceNameScope;
    }

    public UpdateConfigRuleRequest setResourceTypesScope(java.util.List<String> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }
    public java.util.List<String> getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    public UpdateConfigRuleRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    @Deprecated
    public UpdateConfigRuleRequest setTag(java.util.List<UpdateConfigRuleRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateConfigRuleRequestTag> getTag() {
        return this.tag;
    }

    public UpdateConfigRuleRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    @Deprecated
    public UpdateConfigRuleRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    @Deprecated
    public UpdateConfigRuleRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public UpdateConfigRuleRequest setTagsScope(java.util.List<UpdateConfigRuleRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<UpdateConfigRuleRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class UpdateConfigRuleRequestExcludeTagsScope extends TeaModel {
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

        public static UpdateConfigRuleRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigRuleRequestExcludeTagsScope self = new UpdateConfigRuleRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateConfigRuleRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateConfigRuleRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateConfigRuleRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateConfigRuleRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigRuleRequestTag self = new UpdateConfigRuleRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateConfigRuleRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateConfigRuleRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateConfigRuleRequestTagsScope extends TeaModel {
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

        public static UpdateConfigRuleRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigRuleRequestTagsScope self = new UpdateConfigRuleRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateConfigRuleRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateConfigRuleRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
