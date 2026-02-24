// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRulesShrinkRequest extends TeaModel {
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

    /**
     * <p>The ID of the compliance package.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-fe416457e0d90022****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result. Valid values:</p>
     * <ul>
     * <li><p>COMPLIANT: The resource is compliant.</p>
     * </li>
     * <li><p>NON_COMPLIANT: The resource is non-compliant.</p>
     * </li>
     * <li><p>NOT_APPLICABLE: The rule does not apply to the resource.</p>
     * </li>
     * <li><p>INSUFFICIENT_DATA: No data is available.</p>
     * </li>
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
     * <p>The keyword for a fuzzy query.</p>
     * <p>The keyword can be a rule ID, rule name, rule description, or rule template identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource type to be evaluated by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>The risk level of the rule. Valid values:</p>
     * <ul>
     * <li><p>1: high</p>
     * </li>
     * <li><p>2: medium</p>
     * </li>
     * <li><p>3: low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The method that is used to sort the rules. By default, this parameter is not specified. Set the value to <code>CreateDate-Desc</code> to sort the rules in descending order of their creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateDate-Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add a maximum of 20 tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static ListAggregateConfigRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRulesShrinkRequest self = new ListAggregateConfigRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRulesShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateConfigRulesShrinkRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListAggregateConfigRulesShrinkRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListAggregateConfigRulesShrinkRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public ListAggregateConfigRulesShrinkRequest setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
        return this;
    }
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    public ListAggregateConfigRulesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAggregateConfigRulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAggregateConfigRulesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAggregateConfigRulesShrinkRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListAggregateConfigRulesShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public ListAggregateConfigRulesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListAggregateConfigRulesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
