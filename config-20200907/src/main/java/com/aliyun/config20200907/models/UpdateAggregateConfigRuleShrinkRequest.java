// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigRuleShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the member accounts to which the rule applies, which means that the resources within the member accounts are evaluated based on the rule. Separate multiple member account IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>115748125982****</p>
     */
    @NameInMap("AccountIdsScope")
    public String accountIdsScope;

    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to query the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a4e5626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the rule.</p>
     * <p>For more information about how to query the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-4e3d626622af0080****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The name of the rule.</p>
     * <p>For more information about how to query the name of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rule</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The trigger type of the rule. Valid values:</p>
     * <ul>
     * <li>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</li>
     * <li>ScheduledNotification: The rule is periodically triggered.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter applies only to a custom rule.</p>
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
     * <p>test_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IDs of the member accounts to which the rule does not apply, which means that the resources within the member accounts are not evaluated based on the rule. Separate multiple member account IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120886317861****</p>
     */
    @NameInMap("ExcludeAccountIdsScope")
    public String excludeAccountIdsScope;

    /**
     * <p>The IDs of the resource directories to which the rule does not apply, which means that the resources within member accounts in the resource directories are not evaluated based on the rule. Separate multiple resource directory IDs with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter applies only to a rule of a global account group.</p>
     * </li>
     * <li><p>This parameter applies only to a managed rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fd-pWmkqZ****</p>
     */
    @NameInMap("ExcludeFolderIdsScope")
    public String excludeFolderIdsScope;

    /**
     * <p>The IDs of the regions to which the rule not applies. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The IDs of the resource groups to which the rule not applies. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The IDs of the resources excluded from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-t4nbowvtbkss7t326****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>Exclude the specific tag scope of resources .</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The IDs of the resource directories to which the rule applies, which means that the resources within member accounts in the resource directories are evaluated based on the rule.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter applies only to a rule of a global account group.</p>
     * </li>
     * <li><p>This parameter applies only to a managed rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fd-ZtHsRH****</p>
     */
    @NameInMap("FolderIdsScope")
    public String folderIdsScope;

    /**
     * <p>The input parameters of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("InputParameters")
    public String inputParametersShrink;

    /**
     * <p>The interval at which the rule is triggered. Valid values:</p>
     * <ul>
     * <li>One_Hour</li>
     * <li>Three_Hours</li>
     * <li>Six_Hours</li>
     * <li>Twelve_Hours</li>
     * <li>TwentyFour_Hours</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the <code>ConfigRuleTriggerTypes</code> parameter is set to <code>ScheduledNotification</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>One_Hour</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The IDs of the regions to which the rule applies. Separate multiple region IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The IDs of the resource groups to which the rule applies. Separate multiple resource group IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The IDs of the resources included from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The names of the resource to which the rule applies.</p>
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
     * <p>The type of the resource to be evaluated by the rule. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypesScope")
    public String resourceTypesScopeShrink;

    /**
     * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
     * <ul>
     * <li>1: high</li>
     * <li>2: medium</li>
     * <li>3: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public String tagShrink;

    /**
     * <p>The logical relationship when parameter <code>TagsScope</code> takes multiple values, for example: When the parameter <code>TagsScope</code> is <code>&quot;TagsScope.1.TagKey&quot;:&quot;a&quot;, &quot;TagsScope.1.TagValue&quot;:&quot;a&quot;, &quot;TagsScope.2.TagKey&quot;:&quot;b&quot;, &quot;TagsScope.2.TagValue&quot;:&quot;b&quot;</code>, if this parameter is set to<code> AND</code>, it means that the rule only applies to resources bound with both tags <code>a:a</code> and <code>b:b</code>. If not specified, the default logic is <code>OR</code>.</p>
     * <p>It can also be used for the deprecated field <code>TagKeyScope</code> (not recommended), for example: When the parameter <code>TagKeyScope</code> has a value of <code>ECS</code>,<code>OSS</code>, if this parameter is set to <code>AND</code>, it means that the rule only applies to resources bound with both labels <code>ECS</code> and <code>OSS</code>.</p>
     * <p>Values:</p>
     * <ul>
     * <li><p>AND: And.</p>
     * </li>
     * <li><p>OR: Or.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("TagKeyLogicScope")
    public String tagKeyLogicScope;

    /**
     * <p>This parameter is deprecated. We recommend that you use the <code>TagsScope</code> parameter.</p>
     * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule. You must configure the <code>TagKeyScope</code> and <code>TagValueScope</code> parameters at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    @Deprecated
    public String tagKeyScope;

    /**
     * <p>This parameter is deprecated. We recommend that you use the <code>TagsScope</code> parameter.</p>
     * <p>The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule. You must configure the <code>TagKeyScope</code> and <code>TagValueScope</code> parameters at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    @Deprecated
    public String tagValueScope;

    /**
     * <p>The valid tag scope of resources.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<UpdateAggregateConfigRuleShrinkRequestTagsScope> tagsScope;

    public static UpdateAggregateConfigRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigRuleShrinkRequest self = new UpdateAggregateConfigRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateConfigRuleShrinkRequest setAccountIdsScope(String accountIdsScope) {
        this.accountIdsScope = accountIdsScope;
        return this;
    }
    public String getAccountIdsScope() {
        return this.accountIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregateConfigRuleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregateConfigRuleShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public UpdateAggregateConfigRuleShrinkRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public UpdateAggregateConfigRuleShrinkRequest setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
        this.configRuleTriggerTypes = configRuleTriggerTypes;
        return this;
    }
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
    }

    public UpdateAggregateConfigRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAggregateConfigRuleShrinkRequest setExcludeAccountIdsScope(String excludeAccountIdsScope) {
        this.excludeAccountIdsScope = excludeAccountIdsScope;
        return this;
    }
    public String getExcludeAccountIdsScope() {
        return this.excludeAccountIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setExcludeFolderIdsScope(String excludeFolderIdsScope) {
        this.excludeFolderIdsScope = excludeFolderIdsScope;
        return this;
    }
    public String getExcludeFolderIdsScope() {
        return this.excludeFolderIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setExcludeTagsScope(java.util.List<UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setFolderIdsScope(String folderIdsScope) {
        this.folderIdsScope = folderIdsScope;
        return this;
    }
    public String getFolderIdsScope() {
        return this.folderIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setInputParametersShrink(String inputParametersShrink) {
        this.inputParametersShrink = inputParametersShrink;
        return this;
    }
    public String getInputParametersShrink() {
        return this.inputParametersShrink;
    }

    public UpdateAggregateConfigRuleShrinkRequest setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    public UpdateAggregateConfigRuleShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setResourceNameScope(String resourceNameScope) {
        this.resourceNameScope = resourceNameScope;
        return this;
    }
    public String getResourceNameScope() {
        return this.resourceNameScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setResourceTypesScopeShrink(String resourceTypesScopeShrink) {
        this.resourceTypesScopeShrink = resourceTypesScopeShrink;
        return this;
    }
    public String getResourceTypesScopeShrink() {
        return this.resourceTypesScopeShrink;
    }

    public UpdateAggregateConfigRuleShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    @Deprecated
    public UpdateAggregateConfigRuleShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public UpdateAggregateConfigRuleShrinkRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    @Deprecated
    public UpdateAggregateConfigRuleShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    @Deprecated
    public UpdateAggregateConfigRuleShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public UpdateAggregateConfigRuleShrinkRequest setTagsScope(java.util.List<UpdateAggregateConfigRuleShrinkRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<UpdateAggregateConfigRuleShrinkRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope extends TeaModel {
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

        public static UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope self = new UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAggregateConfigRuleShrinkRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateAggregateConfigRuleShrinkRequestTagsScope extends TeaModel {
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

        public static UpdateAggregateConfigRuleShrinkRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateConfigRuleShrinkRequestTagsScope self = new UpdateAggregateConfigRuleShrinkRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateConfigRuleShrinkRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAggregateConfigRuleShrinkRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
