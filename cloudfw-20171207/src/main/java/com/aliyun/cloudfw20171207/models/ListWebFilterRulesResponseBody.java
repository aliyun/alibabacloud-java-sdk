// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListWebFilterRulesResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of web filtering rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListWebFilterRulesResponseBodyRules> rules;

    /**
     * <p>The total number of web filtering rules that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWebFilterRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebFilterRulesResponseBody self = new ListWebFilterRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebFilterRulesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListWebFilterRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWebFilterRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebFilterRulesResponseBody setRules(java.util.List<ListWebFilterRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListWebFilterRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public ListWebFilterRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWebFilterRulesResponseBodyRulesConditions extends TeaModel {
        /**
         * <p>The type of the match condition. Valid values: <strong>URL</strong>, which indicates matching by URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The URL to match. A single asterisk (<em>) matches all URLs. A value ending with /</em> indicates prefix wildcard matching.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/login">www.example.com/login</a></p>
         */
        @NameInMap("Values")
        public String values;

        public static ListWebFilterRulesResponseBodyRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            ListWebFilterRulesResponseBodyRulesConditions self = new ListWebFilterRulesResponseBodyRulesConditions();
            return TeaModel.build(map, self);
        }

        public ListWebFilterRulesResponseBodyRulesConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListWebFilterRulesResponseBodyRulesConditions setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class ListWebFilterRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The list of match conditions for the rule. The list contains only one condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<ListWebFilterRulesResponseBodyRulesConditions> conditions;

        /**
         * <p>The time when the web filtering rule was created. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731465600</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The action performed after the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: Allows the request.</li>
         * <li><strong>Alert</strong>: Monitors the request.</li>
         * <li><strong>Deny</strong>: Blocks the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <p>The time when the web filtering rule was last modified. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731469200</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the web filtering rule.</p>
         * 
         * <strong>example:</strong>
         * <p>wfr-8c1d2e3f4a5b6c7d</p>
         */
        @NameInMap("WebFilterRuleId")
        public String webFilterRuleId;

        /**
         * <p>The ID of the web filtering template to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        @NameInMap("WebFilterTemplateId")
        public String webFilterTemplateId;

        public static ListWebFilterRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListWebFilterRulesResponseBodyRules self = new ListWebFilterRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListWebFilterRulesResponseBodyRules setConditions(java.util.List<ListWebFilterRulesResponseBodyRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListWebFilterRulesResponseBodyRulesConditions> getConditions() {
            return this.conditions;
        }

        public ListWebFilterRulesResponseBodyRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWebFilterRulesResponseBodyRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public ListWebFilterRulesResponseBodyRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListWebFilterRulesResponseBodyRules setWebFilterRuleId(String webFilterRuleId) {
            this.webFilterRuleId = webFilterRuleId;
            return this;
        }
        public String getWebFilterRuleId() {
            return this.webFilterRuleId;
        }

        public ListWebFilterRulesResponseBodyRules setWebFilterTemplateId(String webFilterTemplateId) {
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }
        public String getWebFilterTemplateId() {
            return this.webFilterTemplateId;
        }

    }

}
