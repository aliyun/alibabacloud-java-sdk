// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The description of the event bus.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyEventBus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The event targets.</p>
     */
    @NameInMap("EventTargets")
    public java.util.List<CreateRuleRequestEventTargets> eventTargets;

    /**
     * <p>The event pattern, in JSON format. Valid values: stringEqual and stringExpression. You can specify up to five expressions in the map data structure in each field.</p>
     * <p>You can specify up to five expressions in the map data structure in each field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;source\&quot;: [{\&quot;prefix\&quot;: \&quot;acs.\&quot;}],\&quot;type\&quot;: [{\&quot;prefix\&quot;:\&quot;oss:ObjectReplication\&quot;}],\&quot;subject\&quot;:[{\&quot;prefix\&quot;:\&quot;acs:oss:cn-hangzhou:123456789098****:my-movie-bucket/\&quot;, \&quot;suffix\&quot;:\&quot;.txt\&quot;}]}</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    /**
     * <p>The name of the event rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MNSRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the event rule. Valid values: ENABLE: enables the event rule. It is the default status of the event rule. DISABLE: disables the event rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRuleRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateRuleRequest setEventTargets(java.util.List<CreateRuleRequestEventTargets> eventTargets) {
        this.eventTargets = eventTargets;
        return this;
    }
    public java.util.List<CreateRuleRequestEventTargets> getEventTargets() {
        return this.eventTargets;
    }

    public CreateRuleRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public CreateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CreateRuleRequestEventTargetsConcurrentConfig extends TeaModel {
        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Concurrency")
        public Long concurrency;

        public static CreateRuleRequestEventTargetsConcurrentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargetsConcurrentConfig self = new CreateRuleRequestEventTargetsConcurrentConfig();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargetsConcurrentConfig setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

    }

    public static class CreateRuleRequestEventTargetsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that are not processed or whose maximum number of retries is exceeded are written to the dead-letter queue. Queues in SMQ and ApsaraMQ for RocketMQ can be used as dead-letter queues.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:/queues/rule-deadletterqueue</p>
         */
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Network")
        public String network;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static CreateRuleRequestEventTargetsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargetsDeadLetterQueue self = new CreateRuleRequestEventTargetsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargetsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateRuleRequestEventTargetsDeadLetterQueue setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public CreateRuleRequestEventTargetsDeadLetterQueue setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateRuleRequestEventTargetsDeadLetterQueue setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateRuleRequestEventTargetsDeadLetterQueue setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateRuleRequestEventTargetsParamList extends TeaModel {
        /**
         * <p>The format of input parameters for the event target. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
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
         * <p>The structure of the template for the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value of the event target parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key\&quot;=\&quot;value\&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRuleRequestEventTargetsParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargetsParamList self = new CreateRuleRequestEventTargetsParamList();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargetsParamList setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public CreateRuleRequestEventTargetsParamList setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public CreateRuleRequestEventTargetsParamList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateRuleRequestEventTargetsParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRuleRequestEventTargets extends TeaModel {
        /**
         * <p>The concurrency configuration.</p>
         */
        @NameInMap("ConcurrentConfig")
        public CreateRuleRequestEventTargetsConcurrentConfig concurrentConfig;

        /**
         * <p>The dead-letter queue. Events that are not processed or whose maximum number of retries is exceeded are written to the dead-letter queue. You can use queues in ApsaraMQ for RocketMQ, Simple Message Queue (SMQ, formerly MNS), and ApsaraMQ for Kafka as dead-letter queues. You can also use event buses in EventBridge as dead-letter queues.</p>
         */
        @NameInMap("DeadLetterQueue")
        public CreateRuleRequestEventTargetsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The endpoint of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The fault tolerance policy. Valid values: ALL and NONE. The value ALL specifies that fault tolerance is allowed. If an error occurs in an event, event processing is not blocked. If the event fails to be sent after the maximum number of retries specified by the retry policy is reached, the event is delivered to the dead-letter queue or discarded based on your configurations. The value NONE specifies that fault tolerance is not allowed. If an error occurs in an event and the event fails to be sent after the maximum number of retries specified by the retry policy is reached, event processing is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The ID of the event target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12021</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters that are configured for the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<CreateRuleRequestEventTargetsParamList> paramList;

        /**
         * <p>The retry policy that you want to use to push failed events. Valid values: BACKOFF_RETRY and EXPONENTIAL_DECAY_RETRY. BACKOFF_RETRY: A failed event can be retried up to three times. The interval between two consecutive retries is a random value from 10 seconds to 20 seconds. EXPONENTIAL_DECAY_RETRY: A failed event can be retried up to 176 times. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. The total retry time is 1 day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, and 512 seconds. The interval of 512 seconds is used for 167 retries.</p>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        /**
         * <p>The type of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.mns.queue</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateRuleRequestEventTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleRequestEventTargets self = new CreateRuleRequestEventTargets();
            return TeaModel.build(map, self);
        }

        public CreateRuleRequestEventTargets setConcurrentConfig(CreateRuleRequestEventTargetsConcurrentConfig concurrentConfig) {
            this.concurrentConfig = concurrentConfig;
            return this;
        }
        public CreateRuleRequestEventTargetsConcurrentConfig getConcurrentConfig() {
            return this.concurrentConfig;
        }

        public CreateRuleRequestEventTargets setDeadLetterQueue(CreateRuleRequestEventTargetsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public CreateRuleRequestEventTargetsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public CreateRuleRequestEventTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateRuleRequestEventTargets setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public CreateRuleRequestEventTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateRuleRequestEventTargets setParamList(java.util.List<CreateRuleRequestEventTargetsParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<CreateRuleRequestEventTargetsParamList> getParamList() {
            return this.paramList;
        }

        public CreateRuleRequestEventTargets setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public CreateRuleRequestEventTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
