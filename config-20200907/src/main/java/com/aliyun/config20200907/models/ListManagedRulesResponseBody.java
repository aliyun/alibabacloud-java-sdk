// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListManagedRulesResponseBody extends TeaModel {
    /**
     * <p>The managed rules.</p>
     */
    @NameInMap("ManagedRules")
    public ListManagedRulesResponseBodyManagedRules managedRules;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListManagedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesResponseBody self = new ListManagedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesResponseBody setManagedRules(ListManagedRulesResponseBodyManagedRules managedRules) {
        this.managedRules = managedRules;
        return this;
    }
    public ListManagedRulesResponseBodyManagedRules getManagedRules() {
        return this.managedRules;
    }

    public ListManagedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListManagedRulesResponseBodyManagedRulesManagedRuleListScope extends TeaModel {
        /**
         * <p>The type of resource to which the managed rule applies.</p>
         */
        @NameInMap("ComplianceResourceTypes")
        public java.util.List<String> complianceResourceTypes;

        public static ListManagedRulesResponseBodyManagedRulesManagedRuleListScope build(java.util.Map<String, ?> map) throws Exception {
            ListManagedRulesResponseBodyManagedRulesManagedRuleListScope self = new ListManagedRulesResponseBodyManagedRulesManagedRuleListScope();
            return TeaModel.build(map, self);
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleListScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

    }

    public static class ListManagedRulesResponseBodyManagedRulesManagedRuleList extends TeaModel {
        /**
         * <p>The name of the managed rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The description of the managed rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the topic that describes how the managed rule remediates the incompliant configurations.</p>
         */
        @NameInMap("HelpUrls")
        public String helpUrls;

        /**
         * <p>The unique identifier of the managed rule.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>Classification description of the managed rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>Supported remediation template id.</p>
         */
        @NameInMap("RemediationTemplateIdentifier")
        public String remediationTemplateIdentifier;

        /**
         * <p>Supported remediation template name.</p>
         */
        @NameInMap("RemediationTemplateName")
        public String remediationTemplateName;

        /**
         * <p>The risk level of the resources that do not comply with the managed rule. Valid values:</p>
         * <br>
         * <p>*   1: high risk level</p>
         * <p>*   2: medium risk level</p>
         * <p>*   3: low risk level</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The effective scope of the managed rule.</p>
         */
        @NameInMap("Scope")
        public ListManagedRulesResponseBodyManagedRulesManagedRuleListScope scope;

        /**
         * <p>Whether pre-check is supported. Value:</p>
         * <br>
         * <p>- true: Supported</p>
         * <br>
         * <p>- false: not supported</p>
         */
        @NameInMap("SupportPreviewManagedRule")
        public Boolean supportPreviewManagedRule;

        public static ListManagedRulesResponseBodyManagedRulesManagedRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListManagedRulesResponseBodyManagedRulesManagedRuleList self = new ListManagedRulesResponseBodyManagedRulesManagedRuleList();
            return TeaModel.build(map, self);
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setHelpUrls(String helpUrls) {
            this.helpUrls = helpUrls;
            return this;
        }
        public String getHelpUrls() {
            return this.helpUrls;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setRemediationTemplateIdentifier(String remediationTemplateIdentifier) {
            this.remediationTemplateIdentifier = remediationTemplateIdentifier;
            return this;
        }
        public String getRemediationTemplateIdentifier() {
            return this.remediationTemplateIdentifier;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setRemediationTemplateName(String remediationTemplateName) {
            this.remediationTemplateName = remediationTemplateName;
            return this;
        }
        public String getRemediationTemplateName() {
            return this.remediationTemplateName;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setScope(ListManagedRulesResponseBodyManagedRulesManagedRuleListScope scope) {
            this.scope = scope;
            return this;
        }
        public ListManagedRulesResponseBodyManagedRulesManagedRuleListScope getScope() {
            return this.scope;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setSupportPreviewManagedRule(Boolean supportPreviewManagedRule) {
            this.supportPreviewManagedRule = supportPreviewManagedRule;
            return this;
        }
        public Boolean getSupportPreviewManagedRule() {
            return this.supportPreviewManagedRule;
        }

    }

    public static class ListManagedRulesResponseBodyManagedRules extends TeaModel {
        /**
         * <p>The name of the remediation template.</p>
         */
        @NameInMap("ManagedRuleList")
        public java.util.List<ListManagedRulesResponseBodyManagedRulesManagedRuleList> managedRuleList;

        /**
         * <p>The page number of the returned page. Minimum value: 1.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Valid values: 1 to 500.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of managed rules returned.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListManagedRulesResponseBodyManagedRules build(java.util.Map<String, ?> map) throws Exception {
            ListManagedRulesResponseBodyManagedRules self = new ListManagedRulesResponseBodyManagedRules();
            return TeaModel.build(map, self);
        }

        public ListManagedRulesResponseBodyManagedRules setManagedRuleList(java.util.List<ListManagedRulesResponseBodyManagedRulesManagedRuleList> managedRuleList) {
            this.managedRuleList = managedRuleList;
            return this;
        }
        public java.util.List<ListManagedRulesResponseBodyManagedRulesManagedRuleList> getManagedRuleList() {
            return this.managedRuleList;
        }

        public ListManagedRulesResponseBodyManagedRules setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListManagedRulesResponseBodyManagedRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListManagedRulesResponseBodyManagedRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
