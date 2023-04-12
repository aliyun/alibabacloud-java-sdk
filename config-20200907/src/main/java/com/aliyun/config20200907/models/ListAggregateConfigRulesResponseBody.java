// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The rules.</p>
     */
    @NameInMap("ConfigRules")
    public ListAggregateConfigRulesResponseBodyConfigRules configRules;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRulesResponseBody self = new ListAggregateConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRulesResponseBody setConfigRules(ListAggregateConfigRulesResponseBodyConfigRules configRules) {
        this.configRules = configRules;
        return this;
    }
    public ListAggregateConfigRulesResponseBodyConfigRules getConfigRules() {
        return this.configRules;
    }

    public ListAggregateConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance extends TeaModel {
        /**
         * <p>The compliance evaluation result. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of resources evaluated by the rule.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance self = new ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy extends TeaModel {
        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The name of the account group.</p>
         */
        @NameInMap("AggregatorName")
        public String aggregatorName;

        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the management account that was used to create the rule.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the management account that was used to create the rule.</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The type of the creator of the rule. The value is fixed to AGGREGATOR, which indicates an account group.</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        public static ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy self = new ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

    }

    public static class ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags extends TeaModel {
        /**
         * <p>The tag key of the rule.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the rule.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags self = new ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList extends TeaModel {
        /**
         * <p>The ID of the management account to which the rules belong.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The type of the remediation template. Valid value: OOS, which stands for Operation Orchestration Service.</p>
         */
        @NameInMap("AutomationType")
        public String automationType;

        /**
         * <p>The information about the compliance package.</p>
         */
        @NameInMap("Compliance")
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance;

        /**
         * <p>The ARN of the rule.</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   ACTIVE: The rule is being used to monitor resource configurations.</p>
         * <p>*   DELETING: The rule is being deleted.</p>
         * <p>*   EVALUATING: The rule is triggered and is being used to monitor resource configurations.</p>
         * <p>*   INACTIVE: The rule is disabled.</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The information about the creation of the rule.</p>
         */
        @NameInMap("CreateBy")
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
         * <br>
         * <p>*   1: high risk level</p>
         * <p>*   2: medium risk level</p>
         * <p>*   3: low risk level</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The ID of the rule.</p>
         * <br>
         * <p>*   If the rule was created based on a managed rule, the value of this parameter is the name of the managed rule.</p>
         * <p>*   If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.</p>
         */
        @NameInMap("SourceIdentifier")
        public String sourceIdentifier;

        /**
         * <p>The way in which the rule was created. Valid values:</p>
         * <br>
         * <p>*   CUSTOM_FC: The rule is a custom rule.</p>
         * <p>*   ALIYUN: The rule is created based on a managed rule of Alibaba Cloud.</p>
         */
        @NameInMap("SourceOwner")
        public String sourceOwner;

        /**
         * <p>The tag of the rule.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags> tags;

        public static ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList self = new ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setAutomationType(String automationType) {
            this.automationType = automationType;
            return this;
        }
        public String getAutomationType() {
            return this.automationType;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setCompliance(ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance) {
            this.compliance = compliance;
            return this;
        }
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance getCompliance() {
            return this.compliance;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setCreateBy(ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy getCreateBy() {
            return this.createBy;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setSourceOwner(String sourceOwner) {
            this.sourceOwner = sourceOwner;
            return this;
        }
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setTags(java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListTags> getTags() {
            return this.tags;
        }

    }

    public static class ListAggregateConfigRulesResponseBodyConfigRules extends TeaModel {
        /**
         * <p>The details of the rules.</p>
         */
        @NameInMap("ConfigRuleList")
        public java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rules.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAggregateConfigRulesResponseBodyConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRules self = new ListAggregateConfigRulesResponseBodyConfigRules();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRules setConfigRuleList(java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList) {
            this.configRuleList = configRuleList;
            return this;
        }
        public java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList> getConfigRuleList() {
            return this.configRuleList;
        }

        public ListAggregateConfigRulesResponseBodyConfigRules setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAggregateConfigRulesResponseBodyConfigRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAggregateConfigRulesResponseBodyConfigRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
