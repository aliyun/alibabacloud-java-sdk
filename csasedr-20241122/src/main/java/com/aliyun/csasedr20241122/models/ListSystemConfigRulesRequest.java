// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class ListSystemConfigRulesRequest extends TeaModel {
    /**
     * <p>The list of system rule category IDs.</p>
     */
    @NameInMap("AggregationIds")
    public java.util.List<Integer> aggregationIds;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language used for the rule name and description. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page during paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>Process startup</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of rule types for filtering.</p>
     */
    @NameInMap("RuleTypes")
    public java.util.List<Integer> ruleTypes;

    /**
     * <p>The key for the switch configuration of rules associated with a policy. Use the SelectionKey saved for the same policy.</p>
     * 
     * <strong>example:</strong>
     * <p>7efed2db-cc8c-4704-a1c3-d448c5d41e74</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    /**
     * <p>The system platform identifier used for filtering. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Linux.</li>
     * <li><strong>2</strong>: Windows.</li>
     * <li><strong>3</strong>: Mac.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SystemType")
    public Integer systemType;

    public static ListSystemConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemConfigRulesRequest self = new ListSystemConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemConfigRulesRequest setAggregationIds(java.util.List<Integer> aggregationIds) {
        this.aggregationIds = aggregationIds;
        return this;
    }
    public java.util.List<Integer> getAggregationIds() {
        return this.aggregationIds;
    }

    public ListSystemConfigRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSystemConfigRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListSystemConfigRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSystemConfigRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSystemConfigRulesRequest setRuleTypes(java.util.List<Integer> ruleTypes) {
        this.ruleTypes = ruleTypes;
        return this;
    }
    public java.util.List<Integer> getRuleTypes() {
        return this.ruleTypes;
    }

    public ListSystemConfigRulesRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public ListSystemConfigRulesRequest setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }
    public Integer getSystemType() {
        return this.systemType;
    }

}
