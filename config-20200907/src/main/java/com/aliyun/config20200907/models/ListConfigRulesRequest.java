// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRulesRequest extends TeaModel {
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
    public java.util.List<ListConfigRulesRequestTag> tag;

    public static ListConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesRequest self = new ListConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListConfigRulesRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListConfigRulesRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public ListConfigRulesRequest setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
        return this;
    }
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    public ListConfigRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListConfigRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConfigRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConfigRulesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListConfigRulesRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public ListConfigRulesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListConfigRulesRequest setTag(java.util.List<ListConfigRulesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListConfigRulesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListConfigRulesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListConfigRulesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesRequestTag self = new ListConfigRulesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConfigRulesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
