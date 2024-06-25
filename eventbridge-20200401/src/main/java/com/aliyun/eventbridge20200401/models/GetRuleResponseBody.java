// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    /**
     * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * 
     * <strong>example:</strong>
     * <p>The event rule not existed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BC1857D-E633-5E79-B2C2-43EF5F7730D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. If the operation is successful, the value true is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static class GetRuleResponseBodyDataTargetsConcurrentConfig extends TeaModel {
        @NameInMap("Concurrency")
        public Long concurrency;

        public static GetRuleResponseBodyDataTargetsConcurrentConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataTargetsConcurrentConfig self = new GetRuleResponseBodyDataTargetsConcurrentConfig();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataTargetsConcurrentConfig setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

    }

    public static class GetRuleResponseBodyDataTargetsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventbus/my-event-bus/eventsource/myRocketMQ.source</p>
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
         * <p>The method that is used to deliver events to the event target. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The resource key of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        @NameInMap("ResourceKey")
        public String resourceKey;

        /**
         * <p>The template based on which events are delivered to the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The event target.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key\&quot;=\&quot;value\&quot;}</p>
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
        @NameInMap("ConcurrentConfig")
        public GetRuleResponseBodyDataTargetsConcurrentConfig concurrentConfig;

        /**
         * <p>The dead-letter queue.</p>
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
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The fault tolerance policy. Valid values: ALL: Fault tolerance is allowed. If an error occurs in an event, event processing is not blocked. If the event fails to be sent after the maximum number of retries specified by the retry policy is reached, the event is delivered to the dead-letter queue or discarded based on your configurations. NONE: Fault tolerance is not allowed. If an error occurs in an event and the event fails to be sent after the maximum number of retries specified by the retry policy is reached, event processing is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The ID of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters that are configured for the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<GetRuleResponseBodyDataTargetsParamList> paramList;

        /**
         * <p>The retry policy that is used to push failed events. Valid values: BACKOFF_RETRY: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value between 10 seconds and 20 seconds. EXPONENTIAL_DECAY_RETRY: exponential decay retry. A failed event can be retried up to 176 times. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. The total retry time is 1 day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, and 512 seconds. The interval of 512 seconds is used for 167 retries.</p>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        /**
         * <p>The transformer that is used to push events.</p>
         * 
         * <strong>example:</strong>
         * <p>MATCHED_EVENT</p>
         */
        @NameInMap("PushSelector")
        public String pushSelector;

        /**
         * <p>The type of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.mns.queue</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRuleResponseBodyDataTargets build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataTargets self = new GetRuleResponseBodyDataTargets();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataTargets setConcurrentConfig(GetRuleResponseBodyDataTargetsConcurrentConfig concurrentConfig) {
            this.concurrentConfig = concurrentConfig;
            return this;
        }
        public GetRuleResponseBodyDataTargetsConcurrentConfig getConcurrentConfig() {
            return this.concurrentConfig;
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
         * 
         * <strong>example:</strong>
         * <p>1607071602000</p>
         */
        @NameInMap("CreatedTimestamp")
        public Long createdTimestamp;

        /**
         * <p>The description of the event rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>Housekeeping-Bus</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event pattern, in JSON format. Valid values: stringEqual and stringExpression. You can specify up to five expressions in the map data structure in each field.</p>
         * <p>You can specify up to five expressions in the map data structure in each field.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;source\&quot;:[\&quot;acs.oss\&quot;],\&quot;type\&quot;:[\&quot;oss:BucketQueried:GetBucketStat\&quot;]}</p>
         */
        @NameInMap("FilterPattern")
        public String filterPattern;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789098****:eventbus/default/rule/myRule3</p>
         */
        @NameInMap("RuleARN")
        public String ruleARN;

        /**
         * <p>The name of the event rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ramrolechange-fc</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the event rule. Valid values: ENABLE (default): The event rule is enabled. DISABLE: The event rule is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
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
