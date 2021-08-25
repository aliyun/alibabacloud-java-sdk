// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigRules")
    public ListAggregateConfigRulesResponseBodyConfigRules configRules;

    public static ListAggregateConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRulesResponseBody self = new ListAggregateConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAggregateConfigRulesResponseBody setConfigRules(ListAggregateConfigRulesResponseBodyConfigRules configRules) {
        this.configRules = configRules;
        return this;
    }
    public ListAggregateConfigRulesResponseBodyConfigRules getConfigRules() {
        return this.configRules;
    }

    public static class ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance extends TeaModel {
        @NameInMap("ComplianceType")
        public String complianceType;

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
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("AggregatorName")
        public String aggregatorName;

        @NameInMap("CompliancePackName")
        public String compliancePackName;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("CreatorType")
        public String creatorType;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        public static ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy self = new ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
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

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

    }

    public static class ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList extends TeaModel {
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("SourceOwner")
        public String sourceOwner;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ConfigRuleState")
        public String configRuleState;

        @NameInMap("Compliance")
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance;

        @NameInMap("SourceIdentifier")
        public String sourceIdentifier;

        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateBy")
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy;

        @NameInMap("AutomationType")
        public String automationType;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        public static ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList self = new ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setSourceOwner(String sourceOwner) {
            this.sourceOwner = sourceOwner;
            return this;
        }
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setCompliance(ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance) {
            this.compliance = compliance;
            return this;
        }
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance getCompliance() {
            return this.compliance;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setCreateBy(ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy getCreateBy() {
            return this.createBy;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setAutomationType(String automationType) {
            this.automationType = automationType;
            return this;
        }
        public String getAutomationType() {
            return this.automationType;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

    }

    public static class ListAggregateConfigRulesResponseBodyConfigRules extends TeaModel {
        @NameInMap("ConfigRuleList")
        public java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

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

        public ListAggregateConfigRulesResponseBodyConfigRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAggregateConfigRulesResponseBodyConfigRules setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
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
