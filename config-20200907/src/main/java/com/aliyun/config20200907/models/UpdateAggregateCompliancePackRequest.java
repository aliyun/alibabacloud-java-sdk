// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateCompliancePackRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("Description")
    public String description;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("ConfigRules")
    public java.util.List<UpdateAggregateCompliancePackRequestConfigRules> configRules;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static UpdateAggregateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateCompliancePackRequest self = new UpdateAggregateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public UpdateAggregateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAggregateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public UpdateAggregateCompliancePackRequest setConfigRules(java.util.List<UpdateAggregateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<UpdateAggregateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public UpdateAggregateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregateCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public static class UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters self = new UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateAggregateCompliancePackRequestConfigRules extends TeaModel {
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("ConfigRuleParameters")
        public java.util.List<UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        public static UpdateAggregateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestConfigRules self = new UpdateAggregateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public UpdateAggregateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

    }

}
