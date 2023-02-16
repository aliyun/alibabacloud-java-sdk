// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Id")
        public String id;

        @NameInMap("PushSelector")
        public String pushSelector;

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
        @NameInMap("CreatedTimestamp")
        public Long createdTimestamp;

        @NameInMap("Description")
        public String description;

        @NameInMap("DetailMap")
        public java.util.Map<String, ?> detailMap;

        @NameInMap("EventBusName")
        public String eventBusName;

        @NameInMap("FilterPattern")
        public String filterPattern;

        @NameInMap("RuleARN")
        public String ruleARN;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public String status;

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
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Rules")
        public java.util.List<ListRulesResponseBodyDataRules> rules;

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
