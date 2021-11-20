// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackResponseBody extends TeaModel {
    @NameInMap("CompliancePack")
    public GetCompliancePackResponseBodyCompliancePack compliancePack;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackResponseBody self = new GetCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackResponseBody setCompliancePack(GetCompliancePackResponseBodyCompliancePack compliancePack) {
        this.compliancePack = compliancePack;
        return this;
    }
    public GetCompliancePackResponseBodyCompliancePack getCompliancePack() {
        return this.compliancePack;
    }

    public GetCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("Required")
        public Boolean required;

        public static GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters self = new GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePackConfigRules extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleParameters")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetCompliancePackResponseBodyCompliancePackConfigRules build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePackConfigRules self = new GetCompliancePackResponseBodyCompliancePackConfigRules();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setConfigRuleParameters(java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public GetCompliancePackResponseBodyCompliancePackConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetCompliancePackResponseBodyCompliancePack extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("CompliancePackName")
        public String compliancePackName;

        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        @NameInMap("ConfigRules")
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRules> configRules;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Description")
        public String description;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("Status")
        public String status;

        public static GetCompliancePackResponseBodyCompliancePack build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackResponseBodyCompliancePack self = new GetCompliancePackResponseBodyCompliancePack();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackResponseBodyCompliancePack setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetCompliancePackResponseBodyCompliancePack setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetCompliancePackResponseBodyCompliancePack setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public GetCompliancePackResponseBodyCompliancePack setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public GetCompliancePackResponseBodyCompliancePack setConfigRules(java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRules> configRules) {
            this.configRules = configRules;
            return this;
        }
        public java.util.List<GetCompliancePackResponseBodyCompliancePackConfigRules> getConfigRules() {
            return this.configRules;
        }

        public GetCompliancePackResponseBodyCompliancePack setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetCompliancePackResponseBodyCompliancePack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCompliancePackResponseBodyCompliancePack setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetCompliancePackResponseBodyCompliancePack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
