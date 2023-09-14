// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    /**
     * <p>The error code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListRulesResponseBodyData data;

    /**
     * <p>The error message that is returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponseBody self = new ListRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRulesResponseBody setData(ListRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRulesResponseBodyData getData() {
        return this.data;
    }

    public ListRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRulesResponseBodyDataRulesTargets extends TeaModel {
        /**
         * <p>The endpoint of the event target.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The ID of the custom event target.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transformer that is used to push events.</p>
         */
        @NameInMap("PushSelector")
        public String pushSelector;

        /**
         * <p>The type of the event target. For more information, see [Event target parameters.](https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters)</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRulesResponseBodyDataRulesTargets build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyDataRulesTargets self = new ListRulesResponseBodyDataRulesTargets();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyDataRulesTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListRulesResponseBodyDataRulesTargets setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public ListRulesResponseBodyDataRulesTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRulesResponseBodyDataRulesTargets setPushSelector(String pushSelector) {
            this.pushSelector = pushSelector;
            return this;
        }
        public String getPushSelector() {
            return this.pushSelector;
        }

        public ListRulesResponseBodyDataRulesTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRulesResponseBodyDataRules extends TeaModel {
        /**
         * <p>The creation timestamp.</p>
         */
        @NameInMap("CreatedTimestamp")
        public Long createdTimestamp;

        /**
         * <p>The rule description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The details of the event rule.</p>
         */
        @NameInMap("DetailMap")
        public java.util.Map<String, ?> detailMap;

        /**
         * <p>The name of the event bus.</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event pattern, in JSON format. Valid values: stringEqual pattern stringExpression pattern Each field can have a maximum of five expressions in the map data structure.</p>
         * <br>
         * <p>Each field can have a maximum of five expressions in the map data structure.</p>
         */
        @NameInMap("FilterPattern")
        public String filterPattern;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
         */
        @NameInMap("RuleARN")
        public String ruleARN;

        /**
         * <p>The name of the event rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the event rule. Valid values: ENABLE: The event rule is enabled. It is the default state of the event rule. DISABLE: The event rule is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The event targets.</p>
         */
        @NameInMap("Targets")
        public java.util.List<ListRulesResponseBodyDataRulesTargets> targets;

        public static ListRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyDataRules self = new ListRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyDataRules setCreatedTimestamp(Long createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
            return this;
        }
        public Long getCreatedTimestamp() {
            return this.createdTimestamp;
        }

        public ListRulesResponseBodyDataRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRulesResponseBodyDataRules setDetailMap(java.util.Map<String, ?> detailMap) {
            this.detailMap = detailMap;
            return this;
        }
        public java.util.Map<String, ?> getDetailMap() {
            return this.detailMap;
        }

        public ListRulesResponseBodyDataRules setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListRulesResponseBodyDataRules setFilterPattern(String filterPattern) {
            this.filterPattern = filterPattern;
            return this;
        }
        public String getFilterPattern() {
            return this.filterPattern;
        }

        public ListRulesResponseBodyDataRules setRuleARN(String ruleARN) {
            this.ruleARN = ruleARN;
            return this;
        }
        public String getRuleARN() {
            return this.ruleARN;
        }

        public ListRulesResponseBodyDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRulesResponseBodyDataRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRulesResponseBodyDataRules setTargets(java.util.List<ListRulesResponseBodyDataRulesTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<ListRulesResponseBodyDataRulesTargets> getTargets() {
            return this.targets;
        }

    }

    public static class ListRulesResponseBodyData extends TeaModel {
        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListRulesResponseBodyDataRules> rules;

        /**
         * <p>The total number of entries.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyData self = new ListRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListRulesResponseBodyData setRules(java.util.List<ListRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public ListRulesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
