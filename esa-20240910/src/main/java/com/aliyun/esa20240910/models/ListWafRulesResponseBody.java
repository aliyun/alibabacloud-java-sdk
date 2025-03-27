// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesResponseBody extends TeaModel {
    /**
     * <p>Number of rules used in this WAF phase for the corresponding instance of the site.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceUsage")
    public Long instanceUsage;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned list of rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListWafRulesResponseBodyRules> rules;

    /**
     * <p>Site usage.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SiteUsage")
    public Long siteUsage;

    /**
     * <p>Total number of rules after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesResponseBody self = new ListWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafRulesResponseBody setInstanceUsage(Long instanceUsage) {
        this.instanceUsage = instanceUsage;
        return this;
    }
    public Long getInstanceUsage() {
        return this.instanceUsage;
    }

    public ListWafRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWafRulesResponseBody setRules(java.util.List<ListWafRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListWafRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public ListWafRulesResponseBody setSiteUsage(Long siteUsage) {
        this.siteUsage = siteUsage;
        return this;
    }
    public Long getSiteUsage() {
        return this.siteUsage;
    }

    public ListWafRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWafRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The action corresponding to the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>List of statistical objects for frequency control rules.</p>
         */
        @NameInMap("CharacteristicsFields")
        public java.util.List<String> characteristicsFields;

        /**
         * <p>Rule configuration.</p>
         */
        @NameInMap("Config")
        public WafRuleConfig config;

        /**
         * <p>List of fields for rule matching</p>
         */
        @NameInMap("Fields")
        public java.util.List<String> fields;

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>WAF phase.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>Position order of the rule in the corresponding ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Long position;

        /**
         * <p>Ruleset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("RulesetId")
        public Long rulesetId;

        /**
         * <p>Skip attribute for whitelist rules.</p>
         * 
         * <strong>example:</strong>
         * <p>part</p>
         */
        @NameInMap("Skip")
        public String skip;

        /**
         * <p>Rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>List of WAF phases to be skipped by whitelist rules.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>Configuration for the effective time of the rule.</p>
         */
        @NameInMap("Timer")
        public WafTimer timer;

        /**
         * <p>Rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListWafRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListWafRulesResponseBodyRules self = new ListWafRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListWafRulesResponseBodyRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListWafRulesResponseBodyRules setCharacteristicsFields(java.util.List<String> characteristicsFields) {
            this.characteristicsFields = characteristicsFields;
            return this;
        }
        public java.util.List<String> getCharacteristicsFields() {
            return this.characteristicsFields;
        }

        public ListWafRulesResponseBodyRules setConfig(WafRuleConfig config) {
            this.config = config;
            return this;
        }
        public WafRuleConfig getConfig() {
            return this.config;
        }

        public ListWafRulesResponseBodyRules setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ListWafRulesResponseBodyRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafRulesResponseBodyRules setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListWafRulesResponseBodyRules setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public ListWafRulesResponseBodyRules setRulesetId(Long rulesetId) {
            this.rulesetId = rulesetId;
            return this;
        }
        public Long getRulesetId() {
            return this.rulesetId;
        }

        public ListWafRulesResponseBodyRules setSkip(String skip) {
            this.skip = skip;
            return this;
        }
        public String getSkip() {
            return this.skip;
        }

        public ListWafRulesResponseBodyRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWafRulesResponseBodyRules setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListWafRulesResponseBodyRules setTimer(WafTimer timer) {
            this.timer = timer;
            return this;
        }
        public WafTimer getTimer() {
            return this.timer;
        }

        public ListWafRulesResponseBodyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWafRulesResponseBodyRules setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
