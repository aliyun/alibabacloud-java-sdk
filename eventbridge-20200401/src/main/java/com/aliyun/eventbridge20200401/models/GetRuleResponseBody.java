// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleResponseBody setData(GetRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleResponseBodyData getData() {
        return this.data;
    }

    public GetRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleResponseBodyDataTargetsDeadLetterQueue extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        public static GetRuleResponseBodyDataTargetsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataTargetsDeadLetterQueue self = new GetRuleResponseBodyDataTargetsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataTargetsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class GetRuleResponseBodyDataTargetsParamList extends TeaModel {
        /**
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        @NameInMap("ResourceKey")
        public String resourceKey;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static GetRuleResponseBodyDataTargetsParamList build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataTargetsParamList self = new GetRuleResponseBodyDataTargetsParamList();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataTargetsParamList setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public GetRuleResponseBodyDataTargetsParamList setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public GetRuleResponseBodyDataTargetsParamList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetRuleResponseBodyDataTargetsParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRuleResponseBodyDataTargets extends TeaModel {
        @NameInMap("DeadLetterQueue")
        public GetRuleResponseBodyDataTargetsDeadLetterQueue deadLetterQueue;

        @NameInMap("DetailMap")
        public java.util.Map<String, ?> detailMap;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Id")
        public String id;

        @NameInMap("ParamList")
        public java.util.List<GetRuleResponseBodyDataTargetsParamList> paramList;

        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        @NameInMap("PushSelector")
        public String pushSelector;

        @NameInMap("Type")
        public String type;

        public static GetRuleResponseBodyDataTargets build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataTargets self = new GetRuleResponseBodyDataTargets();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataTargets setDeadLetterQueue(GetRuleResponseBodyDataTargetsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public GetRuleResponseBodyDataTargetsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public GetRuleResponseBodyDataTargets setDetailMap(java.util.Map<String, ?> detailMap) {
            this.detailMap = detailMap;
            return this;
        }
        public java.util.Map<String, ?> getDetailMap() {
            return this.detailMap;
        }

        public GetRuleResponseBodyDataTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetRuleResponseBodyDataTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRuleResponseBodyDataTargets setParamList(java.util.List<GetRuleResponseBodyDataTargetsParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<GetRuleResponseBodyDataTargetsParamList> getParamList() {
            return this.paramList;
        }

        public GetRuleResponseBodyDataTargets setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public GetRuleResponseBodyDataTargets setPushSelector(String pushSelector) {
            this.pushSelector = pushSelector;
            return this;
        }
        public String getPushSelector() {
            return this.pushSelector;
        }

        public GetRuleResponseBodyDataTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetRuleResponseBodyData extends TeaModel {
        @NameInMap("CreatedTimestamp")
        public Long createdTimestamp;

        @NameInMap("Description")
        public String description;

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
        public java.util.List<GetRuleResponseBodyDataTargets> targets;

        public static GetRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyData self = new GetRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyData setCreatedTimestamp(Long createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
            return this;
        }
        public Long getCreatedTimestamp() {
            return this.createdTimestamp;
        }

        public GetRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRuleResponseBodyData setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public GetRuleResponseBodyData setFilterPattern(String filterPattern) {
            this.filterPattern = filterPattern;
            return this;
        }
        public String getFilterPattern() {
            return this.filterPattern;
        }

        public GetRuleResponseBodyData setRuleARN(String ruleARN) {
            this.ruleARN = ruleARN;
            return this;
        }
        public String getRuleARN() {
            return this.ruleARN;
        }

        public GetRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetRuleResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRuleResponseBodyData setTargets(java.util.List<GetRuleResponseBodyDataTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<GetRuleResponseBodyDataTargets> getTargets() {
            return this.targets;
        }

    }

}
