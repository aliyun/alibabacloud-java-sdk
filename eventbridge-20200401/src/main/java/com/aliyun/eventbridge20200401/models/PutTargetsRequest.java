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
     * <p>The event targets to be created or updated. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/limits">Limits.</a></p>
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

    public static class PutTargetsRequestTargetsDeadLetterQueue extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that are not processed or whose maximum retries have been exceeded are written to the dead-letter queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue or acs:mq:cn-hangzhou:123456789098****:/instances/MQ_INST_123456789098****_BX8QbBPL/topic/deadlettertopic or acs:alikafka:cn-hangzhou:123456789098****:instance/alikafka_post-cn-123456/topic/deadlettertopic or acs:eventbridge:cn-hangzhou:123456789098****:eventbus/deadletterbus</p>
         */
        @NameInMap("Arn")
        public String arn;

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

    }

    public static class PutTargetsRequestTargetsParamList extends TeaModel {
        /**
         * <p>The method that is used to deliver events to the event target. For more information,see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The resource parameter of the event target. For more information,see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
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
         * <p>The dead-letter queue. Events that are not processed or whose maximum retries have been exceeded are written to the dead-letter queue. The dead-letter queue feature supports the following queue types: Message Queue for Apache RocketMQ, Message Service, Message Queue for Apache Kafka, and event bus.</p>
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
         * <li><p><strong>ALL</strong>: ignores the error. Fault tolerance is allowed. If an error occurs, event processing is not blocked. If the message exceeds the number of retries specified by the retry policy, the message is delivered to a dead-letter queue or discarded based on your configurations.</p>
         * </li>
         * <li><p><strong>NONE</strong>: does not ignore the error. Fault tolerance is prohibited. If an error occurs and the message exceeds the number of retries specified by the retry policy, event processing is blocked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The ID of the custom event target.</p>
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
         * <p>The retry policy for pushing the event. Valid values:</p>
         * <ul>
         * <li><p><strong>BACKOFF_RETRY</strong>: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value from 10 to 20. Unit: seconds.</p>
         * </li>
         * <li><p><strong>EXPONENTIAL_DECAY_RETRY</strong>: exponential decay retry. The request can be retried up to 176 times. The interval between two consecutive retries exponentially increases to 512 seconds, and the total retry time is one day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, ..., and 512 seconds. The interval of 512 seconds can be used up to one hundred and sixty-seven times in total.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFFRETRY</p>
         */
        @NameInMap("PushRetryStrategy")
        public String pushRetryStrategy;

        /**
         * <p>The type of the event target. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
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
