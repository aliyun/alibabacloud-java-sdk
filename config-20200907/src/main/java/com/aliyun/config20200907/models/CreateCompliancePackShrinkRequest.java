// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CompliancePackName")
    public String compliancePackName;

    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    @NameInMap("ConfigRules")
    public String configRulesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    public static CreateCompliancePackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompliancePackShrinkRequest self = new CreateCompliancePackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompliancePackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCompliancePackShrinkRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateCompliancePackShrinkRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateCompliancePackShrinkRequest setConfigRulesShrink(String configRulesShrink) {
        this.configRulesShrink = configRulesShrink;
        return this;
    }
    public String getConfigRulesShrink() {
        return this.configRulesShrink;
    }

    public CreateCompliancePackShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCompliancePackShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

}
