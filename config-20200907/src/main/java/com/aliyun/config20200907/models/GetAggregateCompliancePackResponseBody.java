// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackResponseBody extends TeaModel {
    @NameInMap("CompliancePack")
    public GetAggregateCompliancePackResponseBodyCompliancePack compliancePack;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackResponseBody self = new GetAggregateCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackResponseBody setCompliancePack(GetAggregateCompliancePackResponseBodyCompliancePack compliancePack) {
        this.compliancePack = compliancePack;
        return this;
    }
    public GetAggregateCompliancePackResponseBodyCompliancePack getCompliancePack() {
        return this.compliancePack;
    }

    public GetAggregateCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("Required")
        public Boolean required;

        public static GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters self = new GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePackConfigRules extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleParameters")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetAggregateCompliancePackResponseBodyCompliancePackConfigRules build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePackConfigRules self = new GetAggregateCompliancePackResponseBodyCompliancePackConfigRules();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleParameters(java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePackConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetAggregateCompliancePackResponseBodyCompliancePack extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("CompliancePackName")
        public String compliancePackName;

        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        @NameInMap("ConfigRules")
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRules> configRules;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Description")
        public String description;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("Status")
        public String status;

        public static GetAggregateCompliancePackResponseBodyCompliancePack build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackResponseBodyCompliancePack self = new GetAggregateCompliancePackResponseBodyCompliancePack();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setConfigRules(java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRules> configRules) {
            this.configRules = configRules;
            return this;
        }
        public java.util.List<GetAggregateCompliancePackResponseBodyCompliancePackConfigRules> getConfigRules() {
            return this.configRules;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetAggregateCompliancePackResponseBodyCompliancePack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
