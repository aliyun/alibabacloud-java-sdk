// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigRuleShrinkRequest extends TeaModel {
    /**
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>required-tags</p>
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
     * <p> If a rule supports the preceding trigger types, separate the types with a comma (,).</p>
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
     * <p>example-description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>ExcludeRegionIdsScope</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>ExcludeResourceGroupIdsScope</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The ID of the resource to be excluded from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to managed rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-t4nbowvtbkss7t326****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>ExcludeTagsScope</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateConfigRuleShrinkRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>Optional field, only used in conjunction with the 24-hour cycle execution to set the trigger time.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fixedHour&quot;:&quot;13&quot;}</p>
     */
    @NameInMap("ExtendContent")
    public String extendContent;

    /**
     * <p>The input parameter of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("InputParameters")
    public String inputParametersShrink;

    /**
     * <p>The intervals at which the rule is triggered. Valid values:</p>
     * <ul>
     * <li>One_Hour: 1 hour.</li>
     * <li>Three_Hours: 3 hours.</li>
     * <li>Six_Hours: 6 hours.</li>
     * <li>Twelve_Hours: 12 hours.</li>
     * <li>TwentyFour_Hours (default): 24 hours.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the ConfigRuleTriggerTypes parameter is set to ScheduledNotification.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>One_Hour</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The ID of the region to which the rule applies. Separate multiple region IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to managed rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The ID of the resource group to which the rule applies. Separate multiple resource group IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter applies only to managed rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>ResourceIdsScope</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypesScope")
    public String resourceTypesScopeShrink;

    /**
     * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
     * <ul>
     * <li>1: high.</li>
     * <li>2: medium.</li>
     * <li>3: low.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The ID of the rule.</p>
     * <ul>
     * <li>If you set the SourceOwner parameter to ALIYUN, set this parameter to the name of the managed rule.</li>
     * <li>If you set the SourceOwner parameter to CUSTOM_FC, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.</li>
     * </ul>
     * <p>For more information about how to query the name of a managed rule, see <a href="https://help.aliyun.com/document_detail/127404.html">Managed rules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>required-tags</p>
     */
    @NameInMap("SourceIdentifier")
    public String sourceIdentifier;

    /**
     * <p>The type of the rule Valid values:</p>
     * <ul>
     * <li>ALIYUN: managed rule.</li>
     * <li>CUSTOM_FC: custom rule.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("SourceOwner")
    public String sourceOwner;

    /**
     * <p>rule attached tags</p>
     */
    @NameInMap("Tag")
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
     * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
     * <blockquote>
     * <p> This parameter applies only to managed rules. You must specify both <code>TagKeyScope</code> and <code>TagValueScope</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    @Deprecated
    public String tagKeyScope;

    /**
     * <p>The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.</p>
     * <blockquote>
     * <p> This parameter applies only to managed rules. You must specify both <code>TagKeyScope</code> and <code>TagValueScope</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    @Deprecated
    public String tagValueScope;

    /**
     * <p>TagsScope</p>
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
         * <p>TagKey</p>
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
