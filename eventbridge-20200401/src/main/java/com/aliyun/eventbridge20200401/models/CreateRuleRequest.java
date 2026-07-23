// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The description of the event rule.</p>
     * 
     * <strong>example:</strong>
     * <p>SMQ filter rule</p>
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
     * <p>A list of event targets.</p>
     */
    @NameInMap("EventTargets")
    public java.util.List<CreateRuleRequestEventTargets> eventTargets;

    /**
     * <p>The event pattern, in JSON format. Supported pattern types are <code>stringEqual</code> and <code>stringExpression</code>. Each field can contain a maximum of five expressions in a map structure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;source&quot;: [
     *     {
     *       &quot;prefix&quot;: &quot;acs.&quot;
     *     }
     *   ],
     *   &quot;type&quot;: [
     *     {
     *       &quot;prefix&quot;: &quot;oss:ObjectReplication&quot;
     *     }
     *   ],
     *   &quot;subject&quot;: [
     *     {
     *       &quot;prefix&quot;: &quot;acs:oss:cn-hangzhou:123456789098****:my-movie-bucket/&quot;,
     *       &quot;suffix&quot;: &quot;.txt&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    /**
     * <p>The name of the event rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMQRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the event rule. Valid values: <code>ENABLE</code>: The rule is enabled. This is the default value. <code>DISABLE</code>: The rule is disabled.</p>
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
         * <p>The maximum number of concurrent executions for the event target.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that fail to be processed or exceed the retry limit are sent to this ARN. Supported services for this parameter include Message Service (MNS) and Message Queue for Apache RocketMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The network type.</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The security group ID.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         */
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
         * <p>The format of the event target parameter. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The name of the target parameter. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        @NameInMap("ResourceKey")
        public String resourceKey;

        /**
         * <p>The template for the event target parameter.</p>
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
         * <p>{&quot;key&quot;=&quot;value&quot;}</p>
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
         * <p>The concurrency control configuration.</p>
         */
        @NameInMap("ConcurrentConfig")
        public CreateRuleRequestEventTargetsConcurrentConfig concurrentConfig;

        /**
         * <p>The dead-letter queue. If an event fails to be processed or exceeds the retry limit, it is sent to the dead-letter queue. Supported services for the dead-letter queue include Message Queue for Apache RocketMQ, Message Service (MNS), Message Queue for Apache Kafka, and EventBridge event buses.</p>
         */
        @NameInMap("DeadLetterQueue")
        public CreateRuleRequestEventTargetsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The delivery endpoint for events.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The fault tolerance policy. Valid values:<br><code>ALL</code>: Enables fault tolerance. Execution continues even if an error occurs. After all retry attempts fail, the event is sent to the dead-letter queue (if configured) or discarded.<br><code>NONE</code>: Disables fault tolerance. Execution is blocked if an error occurs and all retry attempts fail.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The custom ID of the event target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mlm123456JHd2RsRoKw</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters for the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<CreateRuleRequestEventTargetsParamList> paramList;

        /**
         * <p>The push retry strategy. Valid values:<br><code>BACKOFF_RETRY</code>: A backoff retry strategy where the system makes three retry attempts at random intervals of 10 to 20 seconds.<br><code>EXPONENTIAL_DECAY_RETRY</code>: An exponential decay retry strategy where the system makes 176 retry attempts over 24 hours. The interval starts at 1 second and doubles with each of the first 10 attempts (up to 512 seconds). Subsequent retries occur every 512 seconds.<br><br></p>
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
