// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserWafRulesetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Ruleset")
    public GetUserWafRulesetResponseBodyRuleset ruleset;

    public static GetUserWafRulesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserWafRulesetResponseBody self = new GetUserWafRulesetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserWafRulesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserWafRulesetResponseBody setRuleset(GetUserWafRulesetResponseBodyRuleset ruleset) {
        this.ruleset = ruleset;
        return this;
    }
    public GetUserWafRulesetResponseBodyRuleset getRuleset() {
        return this.ruleset;
    }

    public static class GetUserWafRulesetResponseBodyRulesetRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>[&quot;http.host&quot;]</p>
         */
        @NameInMap("CharacteristicsFields")
        public java.util.List<String> characteristicsFields;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;Id&quot;: 20000001,
         *   &quot;Name&quot;: &quot;rule1&quot;,
         *   &quot;Expression&quot;: &quot;ip.src eq 1.1.1.1&quot;,
         *   &quot;Action&quot;: &quot;deny&quot;
         * }</p>
         */
        @NameInMap("Config")
        public WafRuleConfig config;

        /**
         * <strong>example:</strong>
         * <p>[&quot;ip.src&quot;]</p>
         */
        @NameInMap("Fields")
        public java.util.List<String> fields;

        /**
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Long position;

        /**
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("RulesetId")
        public Long rulesetId;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Skip")
        public String skip;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>[&quot;http_custom&quot;]</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2025-07-07T15:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetUserWafRulesetResponseBodyRulesetRules build(java.util.Map<String, ?> map) throws Exception {
            GetUserWafRulesetResponseBodyRulesetRules self = new GetUserWafRulesetResponseBodyRulesetRules();
            return TeaModel.build(map, self);
        }

        public GetUserWafRulesetResponseBodyRulesetRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setCharacteristicsFields(java.util.List<String> characteristicsFields) {
            this.characteristicsFields = characteristicsFields;
            return this;
        }
        public java.util.List<String> getCharacteristicsFields() {
            return this.characteristicsFields;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setConfig(WafRuleConfig config) {
            this.config = config;
            return this;
        }
        public WafRuleConfig getConfig() {
            return this.config;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setRulesetId(Long rulesetId) {
            this.rulesetId = rulesetId;
            return this;
        }
        public Long getRulesetId() {
            return this.rulesetId;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setSkip(String skip) {
            this.skip = skip;
            return this;
        }
        public String getSkip() {
            return this.skip;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetUserWafRulesetResponseBodyRulesetRules setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetUserWafRulesetResponseBodyRuleset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ip.src == 1.1.1.1</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Long position;

        /**
         * <strong>example:</strong>
         * <p>[{}]</p>
         */
        @NameInMap("Rules")
        public java.util.List<GetUserWafRulesetResponseBodyRulesetRules> rules;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Shared")
        public WafBatchRuleShared shared;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetUserWafRulesetResponseBodyRuleset build(java.util.Map<String, ?> map) throws Exception {
            GetUserWafRulesetResponseBodyRuleset self = new GetUserWafRulesetResponseBodyRuleset();
            return TeaModel.build(map, self);
        }

        public GetUserWafRulesetResponseBodyRuleset setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserWafRulesetResponseBodyRuleset setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetUserWafRulesetResponseBodyRuleset setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserWafRulesetResponseBodyRuleset setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserWafRulesetResponseBodyRuleset setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetUserWafRulesetResponseBodyRuleset setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public GetUserWafRulesetResponseBodyRuleset setRules(java.util.List<GetUserWafRulesetResponseBodyRulesetRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetUserWafRulesetResponseBodyRulesetRules> getRules() {
            return this.rules;
        }

        public GetUserWafRulesetResponseBodyRuleset setShared(WafBatchRuleShared shared) {
            this.shared = shared;
            return this;
        }
        public WafBatchRuleShared getShared() {
            return this.shared;
        }

        public GetUserWafRulesetResponseBodyRuleset setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
