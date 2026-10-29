// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutTargetsRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eventTest</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ssr-send-to-vendor-test01</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of event targets to be added or updated. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<PutTargetsRequestTargets> targets;

    public static PutTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutTargetsRequest self = new PutTargetsRequest();
        return TeaModel.build(map, self);
    }

    public PutTargetsRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public PutTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutTargetsRequest setTargets(java.util.List<PutTargetsRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<PutTargetsRequestTargets> getTargets() {
        return this.targets;
    }

    public static class PutTargetsRequestTargetsConcurrentConfig extends TeaModel {
        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("Concurrency")
        public Long concurrency;

        public static PutTargetsRequestTargetsConcurrentConfig build(java.util.Map<String, ?> map) throws Exception {
            PutTargetsRequestTargetsConcurrentConfig self = new PutTargetsRequestTargetsConcurrentConfig();
            return TeaModel.build(map, self);
        }

        public PutTargetsRequestTargetsConcurrentConfig setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

    }

    public static class PutTargetsRequestTargetsDeadLetterQueue extends TeaModel {
        /**
         * <p>The ARN of the dead-letter queue. Unprocessed events or events that exceed the maximum number of retries are written to the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue
         * or
         * acs:mq:cn-hangzhou:123456789098****:/instances/MQ_INST_123456789098****_BX8QbBPL/topic/deadlettertopic
         * or
         * acs:alikafka:cn-hangzhou:123456789098****:instance/alikafka_post-cn-123456/topic/deadlettertopic
         * or
         * acs:eventbridge:cn-hangzhou:123456789098****:eventbus/deadletterbus</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The network type of the dead-letter queue.</p>
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
         * <p>sg-2vp****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-m5****</p>
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

        public static PutTargetsRequestTargetsDeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
            PutTargetsRequestTargetsDeadLetterQueue self = new PutTargetsRequestTargetsDeadLetterQueue();
            return TeaModel.build(map, self);
        }

        public PutTargetsRequestTargetsDeadLetterQueue setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public PutTargetsRequestTargetsDeadLetterQueue setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public PutTargetsRequestTargetsDeadLetterQueue setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public PutTargetsRequestTargetsDeadLetterQueue setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public PutTargetsRequestTargetsDeadLetterQueue setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class PutTargetsRequestTargetsParamList extends TeaModel {
        /**
         * <p>The format of the event target parameter. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The resource parameter of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
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
         * <p>{\&quot;key\&quot;=\&quot;value\&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutTargetsRequestTargetsParamList build(java.util.Map<String, ?> map) throws Exception {
            PutTargetsRequestTargetsParamList self = new PutTargetsRequestTargetsParamList();
            return TeaModel.build(map, self);
        }

        public PutTargetsRequestTargetsParamList setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public PutTargetsRequestTargetsParamList setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public PutTargetsRequestTargetsParamList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public PutTargetsRequestTargetsParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutTargetsRequestTargets extends TeaModel {
        /**
         * <p>The concurrency control configuration.</p>
         */
        @NameInMap("ConcurrentConfig")
        public PutTargetsRequestTargetsConcurrentConfig concurrentConfig;

        /**
         * <p>The dead-letter queue. Unprocessed events or events that exceed the retry limit are written to the dead-letter queue. The supported queue types for the dead-letter queue include ApsaraMQ for RocketMQ, Simple Message Queue (formerly MNS), Message Queue for Apache Kafka, and EventBridge event bus.</p>
         */
        @NameInMap("DeadLetterQueue")
        public PutTargetsRequestTargetsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The delivery endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:123456789098****:services/guide.LATEST/functions/HelloFC</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The fault tolerance strategy. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: Allows fault tolerance. Exceptions are tolerated and do not block execution. If the retry strategy is exhausted, messages are delivered to the dead-letter queue or discarded based on the configuration.</p>
         * </li>
         * <li><p><strong>NONE</strong>: Disables fault tolerance. Exceptions are not tolerated. If an exception occurs and the retry strategy is exhausted, execution is blocked.</p>
         * </li>
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
        public java.util.List<PutTargetsRequestTargetsParamList> paramList;

        /**
         * <p>The push retry policy. Valid values:</p>
         * <ul>
         * <li><p><strong>BACKOFF_RETRY</strong>: Backoff retry policy. The system retries three times, and the interval between each retry is a random value between 10 and 20 seconds.</p>
         * </li>
         * <li><p><strong>EXPONENTIAL_DECAY_RETRY</strong>: Exponential decay retry. The system retries 176 times, and the interval between retries increments exponentially up to 512 seconds. The total retry time is one day. The specific intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512...512 seconds (167 intervals of 512 seconds in total).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFFRETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        /**
         * <p>The type of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.fc.function</p>
         */
        @NameInMap("Type")
        public String type;

        public static PutTargetsRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            PutTargetsRequestTargets self = new PutTargetsRequestTargets();
            return TeaModel.build(map, self);
        }

        public PutTargetsRequestTargets setConcurrentConfig(PutTargetsRequestTargetsConcurrentConfig concurrentConfig) {
            this.concurrentConfig = concurrentConfig;
            return this;
        }
        public PutTargetsRequestTargetsConcurrentConfig getConcurrentConfig() {
            return this.concurrentConfig;
        }

        public PutTargetsRequestTargets setDeadLetterQueue(PutTargetsRequestTargetsDeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }
        public PutTargetsRequestTargetsDeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        public PutTargetsRequestTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public PutTargetsRequestTargets setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public PutTargetsRequestTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutTargetsRequestTargets setParamList(java.util.List<PutTargetsRequestTargetsParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<PutTargetsRequestTargetsParamList> getParamList() {
            return this.paramList;
        }

        public PutTargetsRequestTargets setPushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public PutTargetsRequestTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
