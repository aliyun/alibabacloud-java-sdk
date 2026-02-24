// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The list of rules.</p>
     */
    @NameInMap("ConfigRules")
    public ListConfigRulesResponseBodyConfigRules configRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC3A7E12-72E6-5CC9-A5C1-D8D8919829A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesResponseBody self = new ListConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesResponseBody setConfigRules(ListConfigRulesResponseBodyConfigRules configRules) {
        this.configRules = configRules;
        return this;
    }
    public ListConfigRulesResponseBodyConfigRules getConfigRules() {
        return this.configRules;
    }

    public ListConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance extends TeaModel {
        /**
         * <p>The summary of the compliance evaluation result. Valid values:</p>
         * <ul>
         * <li><p>COMPLIANT: Compliant.</p>
         * </li>
         * <li><p>NON_COMPLIANT: Non-compliant.</p>
         * </li>
         * <li><p>NOT_APPLICABLE: Not applicable.</p>
         * </li>
         * <li><p>INSUFFICIENT_DATA: Insufficient data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of evaluated resources that correspond to the compliance summary.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance self = new ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy extends TeaModel {
        /**
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        public static ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy self = new ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

    }

    public static class ListConfigRulesResponseBodyConfigRulesConfigRuleListTags extends TeaModel {
        /**
         * <p>The tag key of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListConfigRulesResponseBodyConfigRulesConfigRuleListTags build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseBodyConfigRulesConfigRuleListTags self = new ListConfigRulesResponseBodyConfigRulesConfigRuleListTags();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConfigRulesResponseBodyConfigRulesConfigRuleList extends TeaModel {
        /**
         * <p>The ID of the account to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The remediation type. Only Operation Orchestration Service (OOS) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        @NameInMap("AutomationType")
        public String automationType;

        /**
         * <p>The compliance aggregation results of the rule.</p>
         */
        @NameInMap("Compliance")
        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance;

        /**
         * <p>The ARN of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::100931896542****:rule/cr-fdc8626622af00f9****</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-fdc8626622af00f9****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The state of the rule. Valid values:</p>
         * <ul>
         * <li><p>ACTIVE: The rule is enabled.</p>
         * </li>
         * <li><p>DELETING: The rule is being deleted.</p>
         * </li>
         * <li><p>EVALUATING: The rule is being evaluated.</p>
         * </li>
         * <li><p>INACTIVE: The rule is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The information about the creator of the rule.</p>
         */
        @NameInMap("CreateBy")
        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy;

        /**
         * <p>The time when the rule was created. The time is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-19T15:51:00</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The types of resources evaluated by the rule. Multiple resource types are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::EIP::EipAddress</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><p>1: High risk.</p>
         * </li>
         * <li><p>2: Medium risk.</p>
         * </li>
         * <li><p>3: Low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The identifier of the rule.</p>
         * <ul>
         * <li><p>If the rule is a managed rule, this parameter indicates the identifier of the managed rule.</p>
         * </li>
         * <li><p>If the rule is a custom rule, this parameter indicates the Alibaba Cloud Resource Name (ARN) of the function.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("SourceIdentifier")
        public String sourceIdentifier;

        /**
         * <p>The owner of the rule. Valid values:</p>
         * <ul>
         * <li><p>CUSTOM_FC: a custom rule created using a Function Compute (FC) function.</p>
         * </li>
         * <li><p>ALIYUN: a managed rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("SourceOwner")
        public String sourceOwner;

        /**
         * <p>The tags of the rule.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleListTags> tags;

        public static ListConfigRulesResponseBodyConfigRulesConfigRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseBodyConfigRulesConfigRuleList self = new ListConfigRulesResponseBodyConfigRulesConfigRuleList();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setAutomationType(String automationType) {
            this.automationType = automationType;
            return this;
        }
        public String getAutomationType() {
            return this.automationType;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setCompliance(ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance) {
            this.compliance = compliance;
            return this;
        }
        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance getCompliance() {
            return this.compliance;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setCreateBy(ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy getCreateBy() {
            return this.createBy;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setSourceOwner(String sourceOwner) {
            this.sourceOwner = sourceOwner;
            return this;
        }
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        public ListConfigRulesResponseBodyConfigRulesConfigRuleList setTags(java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleListTags> getTags() {
            return this.tags;
        }

    }

    public static class ListConfigRulesResponseBodyConfigRules extends TeaModel {
        /**
         * <p>The details of the rules.</p>
         */
        @NameInMap("ConfigRuleList")
        public java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList;

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
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListConfigRulesResponseBodyConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseBodyConfigRules self = new ListConfigRulesResponseBodyConfigRules();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseBodyConfigRules setConfigRuleList(java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList) {
            this.configRuleList = configRuleList;
            return this;
        }
        public java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleList> getConfigRuleList() {
            return this.configRuleList;
        }

        public ListConfigRulesResponseBodyConfigRules setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConfigRulesResponseBodyConfigRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConfigRulesResponseBodyConfigRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
