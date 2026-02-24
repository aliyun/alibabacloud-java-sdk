// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRulesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-fe416457e0d90022****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result of the rule. Valid values:</p>
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
     * <p>The keyword for the fuzzy query.</p>
     * <p>Supports fuzzy queries by rule ID, rule name, rule description, or rule template identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * <p>The default value is 1.</p>
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
     * <p>The type of resource evaluated by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

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
     * <p>The sorting method. This parameter is not required. Set the value to <code>CreateDate-Desc</code> to sort the rules by creation time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateDate-Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The tags of the resource.</p>
     * <p>A maximum of 20 tags can be attached.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static ListConfigRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesShrinkRequest self = new ListConfigRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesShrinkRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListConfigRulesShrinkRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListConfigRulesShrinkRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public ListConfigRulesShrinkRequest setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
        return this;
    }
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    public ListConfigRulesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListConfigRulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConfigRulesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConfigRulesShrinkRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListConfigRulesShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public ListConfigRulesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListConfigRulesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
