// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    /**
     * <p>The period after which all messages sent to the queue are consumed. Valid values: 0 to 604800. Unit: seconds. Default value: 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    /**
     * <p>The dead-letter queue policy.</p>
     */
    @NameInMap("DlqPolicy")
    public CreateQueueRequestDlqPolicy dlqPolicy;

    /**
     * <p>Specifies whether to enable the log management feature. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    /**
     * <p>The maximum length of the message that is sent to the queue. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
     * 
     * <strong>example:</strong>
     * <p>65536</p>
     */
    @NameInMap("MaximumMessageSize")
    public Long maximumMessageSize;

    /**
     * <p>The maximum duration for which a message is retained in the queue. After the specified retention period ends, the message is deleted regardless of whether the message is consumed. Valid values: 60 to 604800. Unit: seconds. Default value: 345600.</p>
     * 
     * <strong>example:</strong>
     * <p>345600</p>
     */
    @NameInMap("MessageRetentionPeriod")
    public Long messageRetentionPeriod;

    /**
     * <p>The maximum duration for which long polling requests are held after the ReceiveMessage operation is called. Valid values: 0 to 30. Unit: seconds. Default value: 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PollingWaitSeconds")
    public Long pollingWaitSeconds;

    /**
     * <p>The name of the queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateQueueRequestTag> tag;

    /**
     * <p>The duration for which a message stays in the Inactive state after the message is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("VisibilityTimeout")
    public Long visibilityTimeout;

    public static CreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueRequest self = new CreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueRequest setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    public CreateQueueRequest setDlqPolicy(CreateQueueRequestDlqPolicy dlqPolicy) {
        this.dlqPolicy = dlqPolicy;
        return this;
    }
    public CreateQueueRequestDlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    public CreateQueueRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public CreateQueueRequest setMaximumMessageSize(Long maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    public CreateQueueRequest setMessageRetentionPeriod(Long messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public CreateQueueRequest setPollingWaitSeconds(Long pollingWaitSeconds) {
        this.pollingWaitSeconds = pollingWaitSeconds;
        return this;
    }
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    public CreateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateQueueRequest setTag(java.util.List<CreateQueueRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateQueueRequestTag> getTag() {
        return this.tag;
    }

    public CreateQueueRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static class CreateQueueRequestDlqPolicy extends TeaModel {
        /**
         * <p>The queue to which dead-letter messages are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>deadLetterQueue</p>
         */
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        /**
         * <p>Specifies whether to enable the dead-letter message delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReceiveCount")
        public Integer maxReceiveCount;

        public static CreateQueueRequestDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateQueueRequestDlqPolicy self = new CreateQueueRequestDlqPolicy();
            return TeaModel.build(map, self);
        }

        public CreateQueueRequestDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public CreateQueueRequestDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateQueueRequestDlqPolicy setMaxReceiveCount(Integer maxReceiveCount) {
            this.maxReceiveCount = maxReceiveCount;
            return this;
        }
        public Integer getMaxReceiveCount() {
            return this.maxReceiveCount;
        }

    }

    public static class CreateQueueRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateQueueRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateQueueRequestTag self = new CreateQueueRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateQueueRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQueueRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
