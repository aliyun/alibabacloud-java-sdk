// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The queried rules.</p>
     */
    @NameInMap("ConfigRules")
    public ListConfigRulesResponseBodyConfigRules configRules;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("ComplianceType")
        public String complianceType;

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
        @NameInMap("CompliancePackId")
        public String compliancePackId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AutomationType")
        public String automationType;

        @NameInMap("Compliance")
        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance;

        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleState")
        public String configRuleState;

        @NameInMap("CreateBy")
        public ListConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("SourceIdentifier")
        public String sourceIdentifier;

        @NameInMap("SourceOwner")
        public String sourceOwner;

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
         * <p>The types of resources evaluated by the rule. Separate multiple resource types with commas (,).</p>
         */
        @NameInMap("ConfigRuleList")
        public java.util.List<ListConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList;

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
         * <p>The total number of rules.</p>
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
