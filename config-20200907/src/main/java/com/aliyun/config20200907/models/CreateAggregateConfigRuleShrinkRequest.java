// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigRuleShrinkRequest extends TeaModel {
    /**
     * <p>The rule applies only to resources of the specified member accounts. Separate multiple member account IDs with commas (,).</p>
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
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">the referenced document</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a4e5626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>A client token that ensures the request is idempotent. Generate a unique value from your client for each request. The <code>ClientToken</code> parameter must contain only ASCII characters and be no more than 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The conditions for a custom condition rule, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ComplianceConditions&quot;:&quot;{\&quot;operator\&quot;:\&quot;and\&quot;,\&quot;children\&quot;:[{\&quot;operator\&quot;:\&quot;StringEquals\&quot;,\&quot;featurePath\&quot;:\&quot;$.Status\&quot;,\&quot;desired\&quot;:\&quot;1\&quot;,\&quot;featureSource\&quot;:\&quot;CONFIGURATION\&quot;}]}&quot;}</p>
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
     * <p>The trigger type for the rule. Valid values:</p>
     * <ul>
     * <li><p>ConfigurationItemChangeNotification: The rule triggers when a resource configuration changes.</p>
     * </li>
     * <li><p>ScheduledNotification: The rule triggers on a schedule.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ConfigurationItemChangeNotification</p>
     */
    @NameInMap("ConfigRuleTriggerTypes")
    public String configRuleTriggerTypes;

    /**
     * <p>A description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>最多可以定义6组标签。如果资源同时具有指定的所有标签，则视为“合规”。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The rule does not apply to resources of the specified member accounts. Resources in these accounts are not evaluated. Separate multiple member account IDs with commas (,).</p>
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
     * <p>The rule does not apply to resources of member accounts in the specified folders. Resources in these folders are not evaluated. Separate multiple folder IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter applies only to global account group rules.</p>
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
     * <p>The rule does not apply to resources in the specified regions. Resources in these regions are not evaluated. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The rule does not apply to resources in the specified resource groups. Resources in these groups are not evaluated. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The rule does not apply to the specified resources. These resources are not evaluated. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-t4nbowvtbkss7t326****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The scope of tags to exclude.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateAggregateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>Extended content. This parameter currently supports only setting the trigger time for rules that run on a 24-hour cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
     */
    @NameInMap("ExtendContent")
    public String extendContent;

    /**
     * <p>The rule applies only to resources of member accounts in the specified folders. Separate multiple folder IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter applies only to global account group rules.</p>
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
     * <p>The input parameters for the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("InputParameters")
    public String inputParametersShrink;

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
     * <li><p>TwentyFour_Hours (default): 24 hours.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Set this parameter if you set <code>ConfigRuleTriggerTypes</code> to <code>ScheduledNotification</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>One_Hour</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The rule applies only to resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The rule applies only to resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The rule applies only to the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The rule applies only to resources with the specified names.</p>
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
     * <p>The resource types to evaluate. Separate multiple types with commas (,).</p>
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
     * <li><p>1: high</p>
     * </li>
     * <li><p>2: medium</p>
     * </li>
     * <li><p>3: low</p>
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
     * <li><p>If <code>SourceOwner</code> is <code>ALIYUN</code>, enter the identifier of the rule template, such as <code>required-tags</code>.</p>
     * <blockquote>
     * <p>For more information about how to query rule template identifiers, see <a href="https://help.aliyun.com/document_detail/127404.html">the referenced document</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>If <code>SourceOwner</code> is <code>CUSTOM_CONFIGURATION</code>, enter <code>acs-config-configuration</code>.</p>
     * </li>
     * <li><p>If <code>SourceOwner</code> is <code>CUSTOM_FC</code>, enter the Alibaba Cloud Resource Name (ARN) of the Function Compute function.</p>
     * <p>The ARN format is <code>acs:fc:{region}:{accountId}:services/{serviceName}.LATEST/functions/{functionName}</code>. For example, <code>acs:fc:cn-hangzhou:120886317861****:services/service-test.LATEST/functions/config-test</code>.</p>
     * <blockquote>
     * <p>For more information about how to obtain a function ARN, see <a href="https://help.aliyun.com/document_detail/415752.html">the referenced document</a>.</p>
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
     * <p>The type of rule. Valid values:</p>
     * <ul>
     * <li><p>ALIYUN: rule template</p>
     * </li>
     * <li><p>CUSTOM_FC: custom Function Compute rule</p>
     * </li>
     * <li><p>CUSTOM_CONFIGURATION: custom condition rule</p>
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
     * <p>The tag of the rule.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The logical relationship between multiple tags in the <code>TagsScope</code> parameter. For example, if you set <code>TagsScope</code> to <code>&quot;TagsScope.1.TagKey&quot;:&quot;a&quot;,&quot;TagsScope.1.TagValue&quot;:&quot;a&quot;,&quot;TagsScope.2.TagKey&quot;:&quot;b&quot;,&quot;TagsScope.2.TagValue&quot;:&quot;b&quot;</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>a:a</code> and <code>b:b</code> tags. The default value is <code>OR</code>.</p>
     * <p>You can also use this parameter with the deprecated <code>TagKeyScope</code> parameter, but this is not recommended. For example, if you set <code>TagKeyScope</code> to <code>ECS,OSS</code> and set this parameter to <code>AND</code>, the rule applies only to resources that have both the <code>ECS</code> and <code>OSS</code> tags.</p>
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
     * <p>The rule applies only to resources that have the specified tag keys. Separate multiple tag keys with commas (,).</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates. Set both <code>TagKeyScope</code> and <code>TagValueScope</code> together.</p>
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
     * <p>The rule applies only to resources that have the specified tag values.</p>
     * <blockquote>
     * <p>This parameter applies only to rule templates. Set both <code>TagKeyScope</code> and <code>TagValueScope</code> together.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    @Deprecated
    public String tagValueScope;

    /**
     * <p>The scope of tags to include.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<CreateAggregateConfigRuleShrinkRequestTagsScope> tagsScope;

    public static CreateAggregateConfigRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateConfigRuleShrinkRequest self = new CreateAggregateConfigRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateConfigRuleShrinkRequest setAccountIdsScope(String accountIdsScope) {
        this.accountIdsScope = accountIdsScope;
        return this;
    }
    public String getAccountIdsScope() {
        return this.accountIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateConfigRuleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregateConfigRuleShrinkRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public CreateAggregateConfigRuleShrinkRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public CreateAggregateConfigRuleShrinkRequest setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
        this.configRuleTriggerTypes = configRuleTriggerTypes;
        return this;
    }
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
    }

    public CreateAggregateConfigRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregateConfigRuleShrinkRequest setExcludeAccountIdsScope(String excludeAccountIdsScope) {
        this.excludeAccountIdsScope = excludeAccountIdsScope;
        return this;
    }
    public String getExcludeAccountIdsScope() {
        return this.excludeAccountIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setExcludeFolderIdsScope(String excludeFolderIdsScope) {
        this.excludeFolderIdsScope = excludeFolderIdsScope;
        return this;
    }
    public String getExcludeFolderIdsScope() {
        return this.excludeFolderIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setExcludeTagsScope(java.util.List<CreateAggregateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<CreateAggregateConfigRuleShrinkRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setExtendContent(String extendContent) {
        this.extendContent = extendContent;
        return this;
    }
    public String getExtendContent() {
        return this.extendContent;
    }

    public CreateAggregateConfigRuleShrinkRequest setFolderIdsScope(String folderIdsScope) {
        this.folderIdsScope = folderIdsScope;
        return this;
    }
    public String getFolderIdsScope() {
        return this.folderIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setInputParametersShrink(String inputParametersShrink) {
        this.inputParametersShrink = inputParametersShrink;
        return this;
    }
    public String getInputParametersShrink() {
        return this.inputParametersShrink;
    }

    public CreateAggregateConfigRuleShrinkRequest setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    public CreateAggregateConfigRuleShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setResourceNameScope(String resourceNameScope) {
        this.resourceNameScope = resourceNameScope;
        return this;
    }
    public String getResourceNameScope() {
        return this.resourceNameScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setResourceTypesScopeShrink(String resourceTypesScopeShrink) {
        this.resourceTypesScopeShrink = resourceTypesScopeShrink;
        return this;
    }
    public String getResourceTypesScopeShrink() {
        return this.resourceTypesScopeShrink;
    }

    public CreateAggregateConfigRuleShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateAggregateConfigRuleShrinkRequest setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public CreateAggregateConfigRuleShrinkRequest setSourceOwner(String sourceOwner) {
        this.sourceOwner = sourceOwner;
        return this;
    }
    public String getSourceOwner() {
        return this.sourceOwner;
    }

    public CreateAggregateConfigRuleShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateAggregateConfigRuleShrinkRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    @Deprecated
    public CreateAggregateConfigRuleShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    @Deprecated
    public CreateAggregateConfigRuleShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public CreateAggregateConfigRuleShrinkRequest setTagsScope(java.util.List<CreateAggregateConfigRuleShrinkRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<CreateAggregateConfigRuleShrinkRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class CreateAggregateConfigRuleShrinkRequestExcludeTagsScope extends TeaModel {
        /**
         * <p>The tag key of the resource to exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource to exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>value-2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAggregateConfigRuleShrinkRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateConfigRuleShrinkRequestExcludeTagsScope self = new CreateAggregateConfigRuleShrinkRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateAggregateConfigRuleShrinkRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAggregateConfigRuleShrinkRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateAggregateConfigRuleShrinkRequestTagsScope extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAggregateConfigRuleShrinkRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateConfigRuleShrinkRequestTagsScope self = new CreateAggregateConfigRuleShrinkRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateAggregateConfigRuleShrinkRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAggregateConfigRuleShrinkRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
