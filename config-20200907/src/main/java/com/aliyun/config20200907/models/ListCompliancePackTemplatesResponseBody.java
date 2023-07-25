// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance package templates returned.</p>
     */
    @NameInMap("CompliancePackTemplatesResult")
    public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult compliancePackTemplatesResult;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The name of the input parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the input parameter.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the input parameter is required. Valid values:</p>
         * <br>
         * <p>*   true: The input parameter is required.</p>
         * <p>*   false: The input parameter is optional.</p>
         */
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
        /**
         * <p>The input parameters of the managed rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the regulation. This parameter is available only for regulation compliance packages.</p>
         */
        @NameInMap("ControlDescription")
        public String controlDescription;

        /**
         * <p>The ID of the regulation.</p>
         * <br>
         * <p>> This parameter is available only for regulation compliance packages.</p>
         */
        @NameInMap("ControlId")
        public String controlId;

        /**
         * <p>Indicates whether the rule was enabled together with the compliance package. Default value: false. The value true indicates that the rule was enabled together with the compliance package. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("DefaultEnable")
        public Boolean defaultEnable;

        /**
         * <p>The description of the managed rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the managed rule.</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The name of the managed rule.</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>规则评估的资源类型。</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that are not compliant with the managed rule. Valid values:</p>
         * <br>
         * <p>*   1: high</p>
         * <p>*   2: medium</p>
         * <p>*   3: low</p>
         */
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

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setControlDescription(String controlDescription) {
            this.controlDescription = controlDescription;
            return this;
        }
        public String getControlDescription() {
            return this.controlDescription;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setDefaultEnable(Boolean defaultEnable) {
            this.defaultEnable = defaultEnable;
            return this;
        }
        public Boolean getDefaultEnable() {
            return this.defaultEnable;
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

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
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
        /**
         * <p>The ID of the compliance package template.</p>
         */
        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        /**
         * <p>The name of the compliance package template.</p>
         */
        @NameInMap("CompliancePackTemplateName")
        public String compliancePackTemplateName;

        /**
         * <p>An array that contains the managed rules in the compliance package.</p>
         */
        @NameInMap("ConfigRules")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> configRules;

        /**
         * <p>The description of the compliance package.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag of the compliance package.</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The time when the compliance package was last updated.</p>
         */
        @NameInMap("LastUpdate")
        public Integer lastUpdate;

        /**
         * <p>The risk level of the resources that are not compliant with the managed rules in the compliance package. Valid values:</p>
         * <br>
         * <p>*   1: high</p>
         * <p>*   2: medium</p>
         * <p>*   3: low</p>
         */
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

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setLastUpdate(Integer lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }
        public Integer getLastUpdate() {
            return this.lastUpdate;
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
        /**
         * <p>An array that contains the compliance package templates.</p>
         */
        @NameInMap("CompliancePackTemplates")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> compliancePackTemplates;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of the compliance package templates returned.</p>
         */
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
