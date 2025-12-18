// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The queried rules.</p>
     */
    @NameInMap("ConfigRules")
    public ListAggregateConfigRulesResponseBodyConfigRules configRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22EF8287-2C9A-4F1F-80A6-CEFA7612689D</p>
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
         * <ul>
         * <li>COMPLIANT: The resources are evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resources are evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
         * <li>INSUFFICIENT_DATA: No data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of evaluation resources that correspond to the summary result of the rule compliance evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The account group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The name of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_Group</p>
         */
        @NameInMap("AggregatorName")
        public String aggregatorName;

        /**
         * <p>The compliance package ID.</p>
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
         * <p>test-pack-name</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the management account that created the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the management account that create the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The type of the creator of the rule. The value is fixed to AGGREGATOR, which indicates an account group.</p>
         * 
         * <strong>example:</strong>
         * <p>AGGREGATOR</p>
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
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The type of the remediation template. Only OOS is returned, which indicates CloudOps Orchestration Service.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        @NameInMap("AutomationType")
        public String automationType;

        /**
         * <p>The compliance evaluation result.</p>
         */
        @NameInMap("Compliance")
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCompliance compliance;

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
         * <p>test-rule-name</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>ACTIVE: The rule is being used to monitor resource configurations.</li>
         * <li>DELETING: The rule is being deleted.</li>
         * <li>EVALUATING: The rule is triggered and is being used to monitor resource configurations.</li>
         * <li>INACTIVE: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The information about the creation of the rule.</p>
         */
        @NameInMap("CreateBy")
        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleListCreateBy createBy;

        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the test rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The types of resources evaluated by the rule. Multiple resource types are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::EIP::EipAddress</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
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

        /**
         * <p>The identifier of the rule.</p>
         * <ul>
         * <li>If the rule is a managed rule, the value of this parameter is the name of the managed rule.</li>
         * <li>If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of a function.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("SourceIdentifier")
        public String sourceIdentifier;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>CUSTOM_FC: a custom rule.</li>
         * <li>ALIYUN: a managed rule.</li>
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

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
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
         * <p>The details of the rule.</p>
         */
        @NameInMap("ConfigRuleList")
        public java.util.List<ListAggregateConfigRulesResponseBodyConfigRulesConfigRuleList> configRuleList;

        /**
         * <p>The number of the page returned.</p>
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
