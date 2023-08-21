// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The rule name.</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The trigger type of the rule. Valid values:</p>
     * <br>
     * <p>*   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
     * <p>*   ScheduledNotification: The rule is periodically triggered.</p>
     * <br>
     * <p>> Separate two trigger mechanisms with commas (,).</p>
     */
    @NameInMap("ConfigRuleTriggerTypes")
    public String configRuleTriggerTypes;

    /**
     * <p>The rule description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the resource excluded from the compliance evaluations performed based on the rule. Separate multiple resource IDs with commas (,).</p>
     * <br>
     * <p>> This parameter applies only to a managed rule.</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The input parameters of the rule.</p>
     */
    @NameInMap("InputParameters")
    public java.util.Map<String, ?> inputParameters;

    /**
     * <p>The interval at which the rule is triggered. Valid values:</p>
     * <br>
     * <p>*   One_Hour: 1 hour.</p>
     * <p>*   Three_Hours: 3 hours.</p>
     * <p>*   Six_Hours: 6 hours.</p>
     * <p>*   Twelve_Hours: 12 hours.</p>
     * <p>*   TwentyFour_Hours (default): 24 hours.</p>
     * <br>
     * <p>> This parameter is required if the ConfigRuleTriggerTypes parameter is set to ScheduledNotification.</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The ID of the region to which the rule applies. Separate multiple region IDs with commas (,).</p>
     * <br>
     * <p>> This parameter applies only to a managed rule.</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The ID of the resource group to which the rule applies. Separate multiple resource group IDs with commas (,).</p>
     * <br>
     * <p>> This parameter applies only to a managed rule.</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The type of the resource evaluated by the rule. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypesScope")
    public java.util.List<String> resourceTypesScope;

    /**
     * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
     * <br>
     * <p>*   1: high</p>
     * <p>*   2: medium</p>
     * <p>*   3: low</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The identifier of the rule.</p>
     * <br>
     * <p>*   If you set the SourceOwner parameter to ALIYUN, set this parameter to the name of the managed rule.</p>
     * <p>*   If you set the SourceOwner parameter to CUSTOM_FC, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.</p>
     * <br>
     * <p>For more information about how to query the name of a managed rule, see [Managed rules](~~127404~~).</p>
     */
    @NameInMap("SourceIdentifier")
    public String sourceIdentifier;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <br>
     * <p>*   ALIYUN: managed rule</p>
     * <p>*   CUSTOM_FC: a custom rule</p>
     */
    @NameInMap("SourceOwner")
    public String sourceOwner;

    /**
     * <p>The logical relationship among the tag keys if you specify multiple tag keys by using the `TagKeyScope` parameter. For example, if you set the `TagKeyScope` parameter to `ECS,OSS` and set the TagKeyLogicScope parameter to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:</p>
     * <br>
     * <p>*   AND</p>
     * <p>*   OR</p>
     */
    @NameInMap("TagKeyLogicScope")
    public String tagKeyLogicScope;

    /**
     * <p>The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.</p>
     * <br>
     * <p>> This parameter applies only to a managed rule. You must configure the `TagKeyScope` and `TagValueScope` parameters at the same time.</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The tag value used to filter resources. The rule applies only to the resources that use the specified tag value.</p>
     * <br>
     * <p>> This parameter applies only to a managed rule. You must configure the `TagKeyScope` and `TagValueScope` parameters at the same time.</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

    public static CreateConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRuleRequest self = new CreateConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigRuleRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public CreateConfigRuleRequest setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
        this.configRuleTriggerTypes = configRuleTriggerTypes;
        return this;
    }
    public String getConfigRuleTriggerTypes() {
        return this.configRuleTriggerTypes;
    }

    public CreateConfigRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigRuleRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateConfigRuleRequest setInputParameters(java.util.Map<String, ?> inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public java.util.Map<String, ?> getInputParameters() {
        return this.inputParameters;
    }

    public CreateConfigRuleRequest setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }
    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    public CreateConfigRuleRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateConfigRuleRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateConfigRuleRequest setResourceTypesScope(java.util.List<String> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }
    public java.util.List<String> getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    public CreateConfigRuleRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateConfigRuleRequest setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public CreateConfigRuleRequest setSourceOwner(String sourceOwner) {
        this.sourceOwner = sourceOwner;
        return this;
    }
    public String getSourceOwner() {
        return this.sourceOwner;
    }

    public CreateConfigRuleRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    public CreateConfigRuleRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public CreateConfigRuleRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

}
