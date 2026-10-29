// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The description of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>Filter rule for Simple Message Queue (formerly MNS) (SMQ)</p>
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
     * <p>The list of event targets.</p>
     */
    @NameInMap("EventTargets")
    public java.util.List<CreateRuleRequestEventTargets> eventTargets;

    /**
     * <p>The event pattern in JSON format. The following patterns are supported:</p>
     * <ul>
     * <li>stringEqual pattern</li>
     * <li>stringExpression pattern
     * Each field supports up to five expressions in a map structure.</li>
     * </ul>
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
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li>ENABLE: The rule is enabled. This is the default status.</li>
     * <li>DISABLE: The rule is disabled.</li>
     * </ul>
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
         * <p>The number of concurrent executions.</p>
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
         * <p>The ARN of the dead-letter queue. Unprocessed events or events that exceed the retry count are written to the dead-letter queue. Simple Message Queue (formerly MNS) and ApsaraMQ for RocketMQ are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2d****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m12345****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The ID of the VPC where the dead-letter queue resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2z****</p>
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
         * <p>The resource parameter of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        @NameInMap("ResourceKey")
        public String resourceKey;

        /**
         * <p>The parameter template style of the event target.</p>
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
         * <p>The dead-letter queue. Unprocessed events or events that exceed the retry count are written to the dead-letter queue. Supported queue types include ApsaraMQ for RocketMQ, Simple Message Queue (formerly MNS), ApsaraMQ for Kafka, and EventBridge event buses.</p>
         */
        @NameInMap("DeadLetterQueue")
        public CreateRuleRequestEventTargetsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The endpoint URL for delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The fault tolerance strategy. Valid values:</p>
         * <ul>
         * <li>ALL: allows fault tolerance. Exceptions do not block execution. If the retry strategy is exhausted, messages are delivered to the dead-letter queue or discarded based on the configuration.</li>
         * <li>NONE: disables fault tolerance. Exceptions block execution when the retry strategy is exhausted.</li>
         * </ul>
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
         * <p>The parameters of the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<CreateRuleRequestEventTargetsParamList> paramList;

        /**
         * <p>The retry policy for pushing events. Valid values:</p>
         * <ul>
         * <li>BACKOFF_RETRY: backoff retry policy. The system retries 3 times, with a random interval of 10 to 20 seconds between each retry.</li>
         * <li>EXPONENTIAL_DECAY_RETRY: exponential decay retry. The system retries 176 times, with the interval exponentially incrementing to 512 seconds. The total retry time is 1 day. The specific intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, and then 512 seconds for the remaining 167 retries.</li>
         * </ul>
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
