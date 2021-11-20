// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesResponseBody extends TeaModel {
    @NameInMap("CompliancePackTemplatesResult")
    public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult compliancePackTemplatesResult;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCompliancePackTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePackTemplatesResponseBody self = new ListCompliancePackTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompliancePackTemplatesResponseBody setCompliancePackTemplatesResult(ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult compliancePackTemplatesResult) {
        this.compliancePackTemplatesResult = compliancePackTemplatesResult;
        return this;
    }
    public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult getCompliancePackTemplatesResult() {
        return this.compliancePackTemplatesResult;
    }

    public ListCompliancePackTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("Required")
        public Boolean required;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules extends TeaModel {
        @NameInMap("ConfigRuleParameters")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> configRuleParameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setConfigRuleParameters(java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates extends TeaModel {
        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        @NameInMap("CompliancePackTemplateName")
        public String compliancePackTemplateName;

        @NameInMap("ConfigRules")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> configRules;

        @NameInMap("Description")
        public String description;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setCompliancePackTemplateName(String compliancePackTemplateName) {
            this.compliancePackTemplateName = compliancePackTemplateName;
            return this;
        }
        public String getCompliancePackTemplateName() {
            return this.compliancePackTemplateName;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setConfigRules(java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> configRules) {
            this.configRules = configRules;
            return this;
        }
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> getConfigRules() {
            return this.configRules;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult extends TeaModel {
        @NameInMap("CompliancePackTemplates")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> compliancePackTemplates;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setCompliancePackTemplates(java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> compliancePackTemplates) {
            this.compliancePackTemplates = compliancePackTemplates;
            return this;
        }
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> getCompliancePackTemplates() {
            return this.compliancePackTemplates;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
