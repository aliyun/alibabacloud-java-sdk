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
     * <p>The event targets to be created or updated. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that are not processed or whose maximum retries are exceeded are written to the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue or acs:mq:cn-hangzhou:123456789098****:/instances/MQ_INST_123456789098****_BX8QbBPL/topic/deadlettertopic or acs:alikafka:cn-hangzhou:123456789098****:instance/alikafka_post-cn-123456/topic/deadlettertopic or acs:eventbridge:cn-hangzhou:123456789098****:eventbus/deadletterbus</p>
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
         * <p>The format of input parameters for the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The resource key of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
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
         * <p>The event target.</p>
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
         * <p>The concurrency configuration.</p>
         */
        @NameInMap("ConcurrentConfig")
        public PutTargetsRequestTargetsConcurrentConfig concurrentConfig;

        /**
         * <p>The dead-letter queue. Events that are not processed or whose maximum retries are exceeded are written to the dead-letter queue. You can use queues in ApsaraMQ for RocketMQ, Simple Message Queue (SMQ, formerly MNS), and ApsaraMQ for Kafka as dead-letter queues. You can also use event buses in EventBridge as dead-letter queues.</p>
         */
        @NameInMap("DeadLetterQueue")
        public PutTargetsRequestTargetsDeadLetterQueue deadLetterQueue;

        /**
         * <p>The endpoint of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:123456789098****:services/guide.LATEST/functions/HelloFC</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The fault tolerance policy. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: allows fault tolerance. If an error occurs, event processing is not blocked. If the message exceeds the number of retries specified by the retry policy, the message is delivered to a dead-letter queue or discarded based on your configurations.</li>
         * <li><strong>NONE</strong>: prohibits fault tolerance. If an error occurs and the message exceeds the number of retries specified by the retry policy, event processing is blocked.</li>
         * </ul>
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
         * <p>Mlm123456JHd2RsRoKw</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters that are configured for the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<PutTargetsRequestTargetsParamList> paramList;

        /**
         * <p>The retry policy to be used to push events. Valid values:</p>
         * <ul>
         * <li><strong>BACKOFF_RETRY</strong>: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value from 10 seconds to 20 seconds.</li>
         * <li><strong>EXPONENTIAL_DECAY_RETRY</strong>: exponential decay retry. A failed event can be retried up to 176 times. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. The total retry time is 1 day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, and 512 seconds. The interval of 512 seconds is used for 167 retries.</li>
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
