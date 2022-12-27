// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateCompliancePackShrinkRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("CompliancePackName")
    public String compliancePackName;

    @NameInMap("ConfigRules")
    public String configRulesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    @NameInMap("TagValueScope")
    public String tagValueScope;

    public static UpdateAggregateCompliancePackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateCompliancePackShrinkRequest self = new UpdateAggregateCompliancePackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateCompliancePackShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregateCompliancePackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregateCompliancePackShrinkRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public UpdateAggregateCompliancePackShrinkRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public UpdateAggregateCompliancePackShrinkRequest setConfigRulesShrink(String configRulesShrink) {
        this.configRulesShrink = configRulesShrink;
        return this;
    }
    public String getConfigRulesShrink() {
        return this.configRulesShrink;
    }

    public UpdateAggregateCompliancePackShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAggregateCompliancePackShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateAggregateCompliancePackShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateAggregateCompliancePackShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateAggregateCompliancePackShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public UpdateAggregateCompliancePackShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public UpdateAggregateCompliancePackShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

}
