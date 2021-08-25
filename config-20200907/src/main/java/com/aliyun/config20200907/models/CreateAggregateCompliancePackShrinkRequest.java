// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackShrinkRequest extends TeaModel {
    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    @NameInMap("CompliancePackName")
    public String compliancePackName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ConfigRules")
    public String configRulesShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateAggregateCompliancePackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateCompliancePackShrinkRequest self = new CreateAggregateCompliancePackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateCompliancePackShrinkRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateAggregateCompliancePackShrinkRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateAggregateCompliancePackShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregateCompliancePackShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateAggregateCompliancePackShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateCompliancePackShrinkRequest setConfigRulesShrink(String configRulesShrink) {
        this.configRulesShrink = configRulesShrink;
        return this;
    }
    public String getConfigRulesShrink() {
        return this.configRulesShrink;
    }

    public CreateAggregateCompliancePackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
