// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesResponseBody extends TeaModel {
    /**
     * <p>The details of the compliance pack templates.</p>
     */
    @NameInMap("CompliancePackTemplatesResult")
    public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult compliancePackTemplatesResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D67FC82F-25AE-4268-A94C-3348340748F9</p>
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
         * <p>The name of the parameter for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>necessity</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the parameter is required for the managed rule. Valid values:</p>
         * <ul>
         * <li>true: The parameter is required.</li>
         * <li>false: The parameter is not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The parameters of the managed rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the control. This parameter is returned only for compliance packs that are created based on a regulation.</p>
         * 
         * <strong>example:</strong>
         * <p>e) Possible known vulnerabilities should be found and remedied in a timely manner after adequate testing and evaluation.\nf) It shall be able to detect intrusion into important nodes and provide an alarm in case of serious intrusion events.</p>
         */
        @NameInMap("ControlDescription")
        public String controlDescription;

        /**
         * <p>The ID of the control.</p>
         * <blockquote>
         * <p>This parameter appears only for regulatory compliance packages.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8.1.4.4</p>
         */
        @NameInMap("ControlId")
        public String controlId;

        /**
         * <p>Indicates whether the rule can be quickly enabled. Valid values:</p>
         * <ul>
         * <li>true: The rule can be quickly enabled.</li>
         * <li>false: The rule cannot be quickly enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultEnable")
        public Boolean defaultEnable;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>If no vulnerabilities that are of the specified type and severity level and to be fixed exist on the running ECS instances that are protected by Security Center, the configuration is considered compliant. This rule does not apply to ECS instances that are not in the running state.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-instance-updated-security-vul</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The name of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-instance-updated-security-vul</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>The resource types that are evaluated by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the managed rule. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The ID of the compliance pack template.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-5f26ff4e06a300c4****</p>
         */
        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        /**
         * <p>The name of the compliance pack template.</p>
         * 
         * <strong>example:</strong>
         * <p>ClassifiedProtectionPreCheck</p>
         */
        @NameInMap("CompliancePackTemplateName")
        public String compliancePackTemplateName;

        /**
         * <p>A list of default rules in the compliance pack.</p>
         */
        @NameInMap("ConfigRules")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> configRules;

        /**
         * <p>The description of the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>Checks the compliance of Alibaba Cloud resources based on the specific requirements of MLPS 2.0 Level 3.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The classification labels of the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>Regulation</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The UNIX timestamp when the compliance pack was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1747983081</p>
         */
        @NameInMap("LastUpdate")
        public Integer lastUpdate;

        /**
         * <p>The risk level of the rules in the compliance pack. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>A list of compliance pack templates.</p>
         */
        @NameInMap("CompliancePackTemplates")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> compliancePackTemplates;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of compliance pack templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
