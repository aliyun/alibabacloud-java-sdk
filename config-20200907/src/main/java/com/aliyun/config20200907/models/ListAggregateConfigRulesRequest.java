// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRulesRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-f632626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("CompliancePackId")
    public String compliancePackId;

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
     * <p>The keyword that is used for queries.</p>
     * <p>You can perform a fuzzy search by rule ID, rule name, rule description, or managed rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Resource type for the rule to evaluate.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

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

    public static ListAggregateConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRulesRequest self = new ListAggregateConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRulesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListAggregateConfigRulesRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListAggregateConfigRulesRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public ListAggregateConfigRulesRequest setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
        return this;
    }
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    public ListAggregateConfigRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAggregateConfigRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAggregateConfigRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAggregateConfigRulesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListAggregateConfigRulesRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

}
