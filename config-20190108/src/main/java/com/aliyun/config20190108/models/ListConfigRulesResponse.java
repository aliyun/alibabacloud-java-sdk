// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListConfigRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConfigRules")
    @Validation(required = true)
    public ListConfigRulesResponseConfigRules configRules;

    public static ListConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesResponse self = new ListConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigRulesResponse setConfigRules(ListConfigRulesResponseConfigRules configRules) {
        this.configRules = configRules;
        return this;
    }
    public ListConfigRulesResponseConfigRules getConfigRules() {
        return this.configRules;
    }

    public static class ListConfigRulesResponseConfigRulesConfigRuleListCompliance extends TeaModel {
        @NameInMap("ComplianceType")
        @Validation(required = true)
        public String complianceType;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static ListConfigRulesResponseConfigRulesConfigRuleListCompliance build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseConfigRulesConfigRuleListCompliance self = new ListConfigRulesResponseConfigRulesConfigRuleListCompliance();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCompliance setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCompliance setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListConfigRulesResponseConfigRulesConfigRuleListCreateBy extends TeaModel {
        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("CreatorName")
        @Validation(required = true)
        public String creatorName;

        @NameInMap("CreatorType")
        @Validation(required = true)
        public String creatorType;

        @NameInMap("ConfigRuleSceneId")
        @Validation(required = true)
        public String configRuleSceneId;

        @NameInMap("ConfigRuleSceneName")
        @Validation(required = true)
        public String configRuleSceneName;

        public static ListConfigRulesResponseConfigRulesConfigRuleListCreateBy build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseConfigRulesConfigRuleListCreateBy self = new ListConfigRulesResponseConfigRulesConfigRuleListCreateBy();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy setConfigRuleSceneId(String configRuleSceneId) {
            this.configRuleSceneId = configRuleSceneId;
            return this;
        }
        public String getConfigRuleSceneId() {
            return this.configRuleSceneId;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy setConfigRuleSceneName(String configRuleSceneName) {
            this.configRuleSceneName = configRuleSceneName;
            return this;
        }
        public String getConfigRuleSceneName() {
            return this.configRuleSceneName;
        }

    }

    public static class ListConfigRulesResponseConfigRulesConfigRuleList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("ConfigRuleArn")
        @Validation(required = true)
        public String configRuleArn;

        @NameInMap("ConfigRuleId")
        @Validation(required = true)
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        @Validation(required = true)
        public String configRuleName;

        @NameInMap("ConfigRuleState")
        @Validation(required = true)
        public String configRuleState;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("RiskLevel")
        @Validation(required = true)
        public Integer riskLevel;

        @NameInMap("SourceIdentifier")
        @Validation(required = true)
        public String sourceIdentifier;

        @NameInMap("SourceOwner")
        @Validation(required = true)
        public String sourceOwner;

        @NameInMap("AutomationType")
        @Validation(required = true)
        public String automationType;

        @NameInMap("Compliance")
        @Validation(required = true)
        public ListConfigRulesResponseConfigRulesConfigRuleListCompliance compliance;

        @NameInMap("CreateBy")
        @Validation(required = true)
        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy createBy;

        public static ListConfigRulesResponseConfigRulesConfigRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseConfigRulesConfigRuleList self = new ListConfigRulesResponseConfigRulesConfigRuleList();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setSourceOwner(String sourceOwner) {
            this.sourceOwner = sourceOwner;
            return this;
        }
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setAutomationType(String automationType) {
            this.automationType = automationType;
            return this;
        }
        public String getAutomationType() {
            return this.automationType;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setCompliance(ListConfigRulesResponseConfigRulesConfigRuleListCompliance compliance) {
            this.compliance = compliance;
            return this;
        }
        public ListConfigRulesResponseConfigRulesConfigRuleListCompliance getCompliance() {
            return this.compliance;
        }

        public ListConfigRulesResponseConfigRulesConfigRuleList setCreateBy(ListConfigRulesResponseConfigRulesConfigRuleListCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public ListConfigRulesResponseConfigRulesConfigRuleListCreateBy getCreateBy() {
            return this.createBy;
        }

    }

    public static class ListConfigRulesResponseConfigRules extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("ConfigRuleList")
        @Validation(required = true)
        public java.util.List<ListConfigRulesResponseConfigRulesConfigRuleList> configRuleList;

        public static ListConfigRulesResponseConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesResponseConfigRules self = new ListConfigRulesResponseConfigRules();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesResponseConfigRules setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConfigRulesResponseConfigRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConfigRulesResponseConfigRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListConfigRulesResponseConfigRules setConfigRuleList(java.util.List<ListConfigRulesResponseConfigRulesConfigRuleList> configRuleList) {
            this.configRuleList = configRuleList;
            return this;
        }
        public java.util.List<ListConfigRulesResponseConfigRulesConfigRuleList> getConfigRuleList() {
            return this.configRuleList;
        }

    }

}
