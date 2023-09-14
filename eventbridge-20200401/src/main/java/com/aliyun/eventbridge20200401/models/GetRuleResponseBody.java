// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetRuleResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values: true and false.</p>
     */
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
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event source.</p>
         */
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
         * <p>The format that is used by the event target parameter. For more information, see [Limits.](https://www.alibabacloud.com/help/en/eventbridge/latest/limits)</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The resource parameter of the event target. For more information, see [Limits.](https://www.alibabacloud.com/help/en/eventbridge/latest/limits)</p>
         */
        @NameInMap("ResourceKey")
        public String resourceKey;

        /**
         * <p>The template that is used by the event target parameter.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value of the event target parameter.</p>
         */
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
        /**
         * <p>The ID of the custom event target.</p>
         */
        @NameInMap("DeadLetterQueue")
        public GetRuleResponseBodyDataTargetsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The information about the event target.</p>
         */
        @NameInMap("DetailMap")
        public java.util.Map<String, ?> detailMap;

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
         * <p>The parameters that are configured for the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<GetRuleResponseBodyDataTargetsParamList> paramList;

        /**
         * <p>The retry policy that is used to push events. Valid values: BACKOFF_RETRY: backoff retry. If an event failed to be pushed, it can be retried up to three times. The interval between two consecutive retries is a random value from 10 to 20. Unit: seconds. EXPONENTIAL_DECAY_RETRY: exponential decay retry. If an event failed to be pushed, it can be retried up to 176 times. The interval between two consecutive retries exponentially increases to 512 seconds, and the total retry time is one day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, ..., and 512 seconds. The interval of 512 seconds is used for 167 retries.</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

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

        public GetRuleResponseBodyDataTargets setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
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
        /**
         * <p>The timestamp that indicates when the event rule was created.</p>
         */
        @NameInMap("CreatedTimestamp")
        public Long createdTimestamp;

        /**
         * <p>The description of the event rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the event bus.</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event pattern, in JSON format. Valid values: stringEqual and stringExpression. You can specify up to five expressions in the map data structure in each field.</p>
         * <br>
         * <p>You can specify up to five expressions in the map data structure in each field.</p>
         */
        @NameInMap("FilterPattern")
        public String filterPattern;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event rule.</p>
         */
        @NameInMap("RuleARN")
        public String ruleARN;

        /**
         * <p>The name of the event rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the event rule. Valid values: ENABLE (default): The event rule is enabled. DISABLE: The event rule is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The event targets.</p>
         */
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
