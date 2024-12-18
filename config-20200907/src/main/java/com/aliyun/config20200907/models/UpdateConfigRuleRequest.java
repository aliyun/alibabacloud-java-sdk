// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigRuleRequest extends TeaModel {
    /**
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the rule.</p>
     * <p>For more information about how to query the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-a260626622af0005****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The name of the rule.</p>
     * <p>For more information about how to query the name of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
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
     * <p> This parameter applies only to custom rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ConfigurationItemChangeNotification</p>
     */
    @NameInMap("ConfigRuleTriggerTypes")
    public String configRuleTriggerTypes;

    /**
     * <p>The description of the rule. You can enter up to 500 characters.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

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

    @NameInMap("ExcludeTagsScope")
    public java.util.List<UpdateConfigRuleRequestExcludeTagsScope> excludeTagsScope;

    /**
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
     * <p>The intervals at which the rule is triggered. Valid values:</p>
     * <ul>
     * <li>One_Hour: 1 hour.</li>
     * <li>Three_Hours: 3 hours.</li>
     * <li>Six_Hours: 6 hours.</li>
     * <li>Twelve_Hours: 12 hours.</li>
     * <li>TwentyFour_Hours (default): 24 hours.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you set the <code>ConfigRuleTriggerTypes</code> parameter to <code>ScheduledNotification</code>.</p>
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

    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The type of the resource to be evaluated by the rule. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypesScope")
    public java.util.List<String> resourceTypesScope;

    /**
     * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
     * <ul>
     * <li>1: high risk level</li>
     * <li>2: medium risk level</li>
     * <li>3: low risk level</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The logical relationship among the tag keys if you specify multiple tag keys for the <code>TagKeyScope</code> parameter. For example, if you set the <code>TagKeyScope</code> parameter to <code>ECS,OSS</code> and the TagKeyLogicScope parameter to <code>AND</code>, the rule applies to resources with both the <code>ECS</code> and <code>OSS</code> tag keys. Valid values:</p>
     * <ul>
     * <li>AND</li>
     * <li>OR</li>
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
     * <p> This parameter applies only to a managed rule. You must configure the <code>TagKeyScope</code> and <code>TagValueScope</code> parameters at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.</p>
     * <blockquote>
     * <p> This parameter applies only to a managed rule. You must configure the <code>TagKeyScope</code> and <code>TagValueScope</code> parameters at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

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

    public UpdateConfigRuleRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    public UpdateConfigRuleRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

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
        @NameInMap("TagKey")
        public String tagKey;

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

    public static class UpdateConfigRuleRequestTagsScope extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

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
