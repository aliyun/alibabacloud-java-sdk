// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigRuleRequest extends TeaModel {
    /**
     * <p>The rule applies only to resources of the specified member accounts. Separate multiple member account IDs with a comma (,).</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>115748125982****</p>
     */
    @NameInMap("AccountIdsScope")
    public String accountIdsScope;

    /**
     * <p>The account group ID.</p>
     * <p>For more information, see <a href="">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a4e5626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>A client token used to ensure the idempotence of the request. Make sure that the client token is unique for each request. The <code>ClientToken</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The conditions for the custom rule, specified in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ComplianceConditions&quot;:&quot;{\&quot;operator\&quot;:\&quot;and\&quot;,\&quot;children\&quot;:[{\&quot;operator\&quot;:\&quot;StringEquals\&quot;,\&quot;featurePath\&quot;:\&quot;$.Status\&quot;,\&quot;desired\&quot;:\&quot;1\&quot;,\&quot;featureSource\&quot;:\&quot;CONFIGURATION\&quot;}]}&quot;}</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The rule ID.</p>
     * <p>For more information, see <a href="">ListAggregateConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-4e3d626622af0080****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The rule name.</p>
     * <p>For more information, see <a href="">ListAggregateConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>存在所有指定标签</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The trigger mechanism of the rule. Valid values:</p>
     * <ul>
     * <li><p>ConfigurationItemChangeNotification: Configuration changes.</p>
     * </li>
     * <li><p>ScheduledNotification: Scheduled execution.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can modify this parameter only for custom rules.</p>
     * </blockquote>
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
     * <p>The member accounts to exclude. The rule does not apply to resources of these member accounts. Separate multiple member account IDs with a comma (,).</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120886317861****</p>
     */
    @NameInMap("ExcludeAccountIdsScope")
    public String excludeAccountIdsScope;

    /**
     * <p>The folders to exclude. The rule does not apply to resources of member accounts in these folders. Separate multiple folder IDs with a comma (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter applies only to rules in a global account group.</p>
     * </li>
     * <li><p>This parameter applies only to rule templates.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fd-pWmkqZ****</p>
     */
    @NameInMap("ExcludeFolderIdsScope")
    public String excludeFolderIdsScope;

    /**
     * <p>The regions to exclude. The rule does not apply to resources in these regions. Separate multiple region IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The resource groups to exclude. The rule does not apply to resources in these resource groups. Separate multiple resource group IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The resources to exclude. The rule does not apply to these resources. Separate multiple resource IDs with a comma (,).</p>
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
     * <p>The excluded tag scope.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<UpdateAggregateConfigRuleRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The rule applies only to resources of member accounts in the specified resource directory IDs.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter applies only to rules in a global account group.</p>
     * </li>
     * <li><p>This parameter applies only to rule templates.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fd-ZtHsRH****</p>
     */
    @NameInMap("FolderIdsScope")
    public String folderIdsScope;

    /**
     * <p>The rule parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("InputParameters")
    public java.util.Map<String, ?> inputParameters;

    /**
     * <p>The frequency at which the rule runs. Valid values:</p>
     * <ul>
     * <li><p>One_Hour: 1 hour.</p>
     * </li>
     * <li><p>Three_Hours: 3 hours.</p>
     * </li>
     * <li><p>Six_Hours: 6 hours.</p>
     * </li>
     * <li><p>Twelve_Hours: 12 hours.</p>
     * </li>
     * <li><p>TwentyFour_Hours: 24 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you set <code>ConfigRuleTriggerTypes</code> to <code>ScheduledNotification</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>One_Hour</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The rule applies only to resources in the specified region IDs. Separate multiple region IDs with a comma (,).</p>
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
     * <p>The rule applies only to resources in the specified resource group IDs. Separate multiple resource group IDs with a comma (,).</p>
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
     * <p>The rule applies only to the specified resource IDs. Separate multiple resource IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The rule applies only to resources with the specified resource name.</p>
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
     * <p>The resource types that the rule evaluates. Separate multiple resource types with a comma (,).</p>
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
     * <p>The rule applies only to resources with the specified resource name.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<UpdateAggregateConfigRuleRequestTag> tag;

    /**
     * <p>The logical relationship for multiple tags in the <code>TagsScope</code> parameter. For example, if you set the <code>TagsScope</code> parameter to <code>&quot;TagsScope.1.TagKey&quot;:&quot;a&quot;,&quot;TagsScope.1.TagValue&quot;:&quot;a&quot;,&quot;TagsScope.2.TagKey&quot;:&quot;b&quot;,&quot;TagsScope.2.TagValue&quot;:&quot;b&quot;</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>a:a</code> and <code>b:b</code> tags. If you do not set this parameter, the default value is <code>OR</code>.</p>
     * <p>This parameter also works with the deprecated <code>TagKeyScope</code> parameter (not recommended). For example, if you set the <code>TagKeyScope</code> parameter to <code>ECS,OSS</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>ECS</code> and <code>OSS</code> tags.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>AND: Logical AND.</p>
     * </li>
     * <li><p>OR: Logical OR.</p>
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
     * <p>The rule applies only to resources with the specified tag.</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates. You must specify both <code>TagKeyScope</code> and <code>TagValueScope</code>.</p>
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
     * <p>The rule applies only to resources with the specified tag.</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates. You must specify both <code>TagKeyScope</code> and <code>TagValueScope</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    @Deprecated
    public String tagValueScope;

    /**
     * <p>The tag scope.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<UpdateAggregateConfigRuleRequestTagsScope> tagsScope;

    public static UpdateAggregateConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigRuleRequest self = new UpdateAggregateConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateConfigRuleRequest setAccountIdsScope(String accountIdsScope) {
        this.accountIdsScope = accountIdsScope;
        return this;
    }
    public String getAccountIdsScope() {
        return this.accountIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregateConfigRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregateConfigRuleRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateAggregateConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public UpdateAggregateConfigRuleRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public UpdateAggregateConfigRuleRequest setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
        this.configRuleTriggerTypes = configRuleTriggerTypes;
        return this;
    }
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
    }

    public UpdateAggregateConfigRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAggregateConfigRuleRequest setExcludeAccountIdsScope(String excludeAccountIdsScope) {
        this.excludeAccountIdsScope = excludeAccountIdsScope;
        return this;
    }
    public String getExcludeAccountIdsScope() {
        return this.excludeAccountIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setExcludeFolderIdsScope(String excludeFolderIdsScope) {
        this.excludeFolderIdsScope = excludeFolderIdsScope;
        return this;
    }
    public String getExcludeFolderIdsScope() {
        return this.excludeFolderIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setExcludeTagsScope(java.util.List<UpdateAggregateConfigRuleRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<UpdateAggregateConfigRuleRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public UpdateAggregateConfigRuleRequest setFolderIdsScope(String folderIdsScope) {
        this.folderIdsScope = folderIdsScope;
        return this;
    }
    public String getFolderIdsScope() {
        return this.folderIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setInputParameters(java.util.Map<String, ?> inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public java.util.Map<String, ?> getInputParameters() {
        return this.inputParameters;
    }

    public UpdateAggregateConfigRuleRequest setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    public UpdateAggregateConfigRuleRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateAggregateConfigRuleRequest setResourceNameScope(String resourceNameScope) {
        this.resourceNameScope = resourceNameScope;
        return this;
    }
    public String getResourceNameScope() {
        return this.resourceNameScope;
    }

    public UpdateAggregateConfigRuleRequest setResourceTypesScope(java.util.List<String> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }
    public java.util.List<String> getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    public UpdateAggregateConfigRuleRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    @Deprecated
    public UpdateAggregateConfigRuleRequest setTag(java.util.List<UpdateAggregateConfigRuleRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateAggregateConfigRuleRequestTag> getTag() {
        return this.tag;
    }

    public UpdateAggregateConfigRuleRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    @Deprecated
    public UpdateAggregateConfigRuleRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    @Deprecated
    public UpdateAggregateConfigRuleRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public UpdateAggregateConfigRuleRequest setTagsScope(java.util.List<UpdateAggregateConfigRuleRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<UpdateAggregateConfigRuleRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class UpdateAggregateConfigRuleRequestExcludeTagsScope extends TeaModel {
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

        public static UpdateAggregateConfigRuleRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateConfigRuleRequestExcludeTagsScope self = new UpdateAggregateConfigRuleRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateConfigRuleRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAggregateConfigRuleRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateAggregateConfigRuleRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.
         * You can add up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.
         * You can add up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateAggregateConfigRuleRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateConfigRuleRequestTag self = new UpdateAggregateConfigRuleRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateConfigRuleRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAggregateConfigRuleRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAggregateConfigRuleRequestTagsScope extends TeaModel {
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

        public static UpdateAggregateConfigRuleRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateConfigRuleRequestTagsScope self = new UpdateAggregateConfigRuleRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateConfigRuleRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAggregateConfigRuleRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
