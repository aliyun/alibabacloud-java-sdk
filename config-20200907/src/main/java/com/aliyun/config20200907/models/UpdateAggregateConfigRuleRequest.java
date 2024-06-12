// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigRuleRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to query the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to query the ID of a rule, see [ListAggregateConfigRules](https://help.aliyun.com/document_detail/264148.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The name of the rule.</p>
     * <br>
     * <p>For more information about how to query the name of a rule, see [ListAggregateConfigRules](https://help.aliyun.com/document_detail/264148.html).</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The trigger type of the rule. Valid values:</p>
     * <br>
     * <p>*   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
     * <p>*   ScheduledNotification: The rule is periodically triggered.</p>
     * <br>
     * <p>>  This parameter applies only to a custom rule.</p>
     */
    @NameInMap("ConfigRuleTriggerTypes")
    public String configRuleTriggerTypes;

    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule. Separate multiple member account IDs with commas (,).</p>
     * <br>
     * <p>>  This parameter applies only to a managed rule.</p>
     */
    @NameInMap("ExcludeAccountIdsScope")
    public String excludeAccountIdsScope;

    /**
     * <p>The ID of the resource directory to which the rule does not apply, which means that the resources within member accounts in the resource directory are not evaluated based on the rule. Separate multiple resource directory IDs with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter applies only to a rule of a global account group.</p>
     * <p>*   This parameter applies only to a managed rule.</p>
     */
    @NameInMap("ExcludeFolderIdsScope")
    public String excludeFolderIdsScope;

    /**
     * <p>The ID of the resource to be excluded from the compliance evaluations performed by the rule. Separate multiple resource IDs with commas (,).</p>
     * <br>
     * <p>>  This parameter applies only to a managed rule.</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The ID of the resource directory to which the rule applies, which means that the resources within member accounts in the resource directory are evaluated based on the rule.</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter applies only to a rule of a global account group.</p>
     * <p>*   This parameter applies only to a managed rule.</p>
     */
    @NameInMap("FolderIdsScope")
    public String folderIdsScope;

    /**
     * <p>The input parameters of the rule.</p>
     */
    @NameInMap("InputParameters")
    public java.util.Map<String, ?> inputParameters;

    /**
     * <p>The intervals at which the rule is triggered. Valid values:</p>
     * <br>
     * <p>*   One_Hour: 1 hour</p>
     * <p>*   Three_Hours: 3 hours</p>
     * <p>*   Six_Hours: 6 hours</p>
     * <p>*   Twelve_Hours: 12 hours</p>
     * <p>*   TwentyFour_Hours: 24 hours</p>
     * <br>
     * <p>>  This parameter is required if the `ConfigRuleTriggerTypes` parameter is set to `ScheduledNotification`.</p>
     */
    @NameInMap("MaximumExecutionFrequency")
    public String maximumExecutionFrequency;

    /**
     * <p>The ID of the region to which the rule applies. Separate multiple region IDs with commas (,).</p>
     * <br>
     * <p>>  This parameter applies only to a managed rule.</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The ID of the resource group to which the rule applies. Separate multiple resource group IDs with commas (,).</p>
     * <br>
     * <p>>  This parameter applies only to a managed rule.</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The type of the resource to be evaluated by the rule. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypesScope")
    public java.util.List<String> resourceTypesScope;

    /**
     * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
     * <br>
     * <p>*   1: high risk level</p>
     * <p>*   2: medium risk level</p>
     * <p>*   3: low risk level</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The logical relationship among the tag keys if you specify multiple tag keys for the `TagKeyScope` parameter. For example, if you set the `TagKeyScope` parameter to `ECS,OSS` and the TagKeyLogicScope parameter to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:</p>
     * <br>
     * <p>*   AND</p>
     * <p>*   OR</p>
     */
    @NameInMap("TagKeyLogicScope")
    public String tagKeyLogicScope;

    /**
     * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
     * <br>
     * <p>>  This parameter applies only to a managed rule. You must set the `TagKeyScope` and `TagValueScope` parameters at the same time.</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The tag value used to filter resources. The rule applies only to the resources with the specified tag value.</p>
     * <br>
     * <p>>  This parameter applies only to a managed rule. You must set the `TagKeyScope` and `TagValueScope` parameters at the same time.</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

    public static UpdateAggregateConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigRuleRequest self = new UpdateAggregateConfigRuleRequest();
        return TeaModel.build(map, self);
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

    public UpdateAggregateConfigRuleRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
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

    public UpdateAggregateConfigRuleRequest setTagKeyLogicScope(String tagKeyLogicScope) {
        this.tagKeyLogicScope = tagKeyLogicScope;
        return this;
    }
    public String getTagKeyLogicScope() {
        return this.tagKeyLogicScope;
    }

    public UpdateAggregateConfigRuleRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public UpdateAggregateConfigRuleRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

}
