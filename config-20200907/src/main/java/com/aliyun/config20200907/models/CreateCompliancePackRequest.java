// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CompliancePackName")
    public String compliancePackName;

    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    @NameInMap("ConfigRules")
    public java.util.List<CreateCompliancePackRequestConfigRules> configRules;

    @NameInMap("DefaultEnable")
    public Boolean defaultEnable;

    @NameInMap("Description")
    public String description;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    public static CreateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompliancePackRequest self = new CreateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCompliancePackRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateCompliancePackRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateCompliancePackRequest setConfigRules(java.util.List<CreateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<CreateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public CreateCompliancePackRequest setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
        return this;
    }
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    public CreateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public static class CreateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestConfigRulesConfigRuleParameters self = new CreateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public CreateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateCompliancePackRequestConfigRules extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleParameters")
        public java.util.List<CreateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static CreateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackRequestConfigRules self = new CreateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackRequestConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public CreateCompliancePackRequestConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public CreateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<CreateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<CreateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public CreateCompliancePackRequestConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public CreateCompliancePackRequestConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}
