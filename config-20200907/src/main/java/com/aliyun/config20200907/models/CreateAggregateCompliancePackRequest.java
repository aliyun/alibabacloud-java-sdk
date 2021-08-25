// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackRequest extends TeaModel {
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
    public java.util.List<CreateAggregateCompliancePackRequestConfigRules> configRules;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateAggregateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateCompliancePackRequest self = new CreateAggregateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateCompliancePackRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateAggregateCompliancePackRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateAggregateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateAggregateCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateCompliancePackRequest setConfigRules(java.util.List<CreateAggregateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public CreateAggregateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters self = new CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateAggregateCompliancePackRequestConfigRules extends TeaModel {
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleParameters")
        public java.util.List<CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        public static CreateAggregateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackRequestConfigRules self = new CreateAggregateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public CreateAggregateCompliancePackRequestConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public CreateAggregateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<CreateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

    }

}
