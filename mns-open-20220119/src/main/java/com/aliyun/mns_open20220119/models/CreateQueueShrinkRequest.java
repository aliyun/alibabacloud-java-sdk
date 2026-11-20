// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateQueueShrinkRequest extends TeaModel {
    /**
     * <p>The delay time for all messages sent to the queue. A message can be consumed only after the specified delay time elapses from the time it is sent to the queue. Valid values: 0 to 604800. Unit: seconds. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    /**
     * <p>The dead-letter policy.</p>
     */
    @NameInMap("DlqPolicy")
    public String dlqPolicyShrink;

    /**
     * <p>Specifies whether to enable the Log Management feature. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    /**
     * <p>Specifies whether log broker encryption is enabled. Valid values: true and false.</p>
     */
    @NameInMap("EnableSSE")
    public Boolean enableSSE;

    /**
     * <p>The KMS key ID. This parameter is required only when SseType is set to KMS.</p>
     * 
     * <strong>example:</strong>
     * <p>key-xxx</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The maximum size of a message body that can be sent to the queue. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
     * 
     * <strong>example:</strong>
     * <p>65536</p>
     */
    @NameInMap("MaximumMessageSize")
    public Long maximumMessageSize;

    /**
     * <p>The maximum retention period of a message in the queue. After the specified period elapses from the time the message is sent to the queue, the message is deleted regardless of whether it has been received. Valid values: 60 to 604800. Unit: seconds. Default value: 345600.</p>
     * 
     * <strong>example:</strong>
     * <p>345600</p>
     */
    @NameInMap("MessageRetentionPeriod")
    public Long messageRetentionPeriod;

    /**
     * <p>The maximum wait time for a ReceiveMessage request when no messages are available in the queue. Valid values: 0 to 30. Unit: seconds. Default value: 0.</p>
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
     * <p>The type of the queue. Valid values:</p>
     * <ul>
     * <li>normal: Standard queue.</li>
     * <li>fifo: FIFO queue.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("QueueType")
    public String queueType;

    /**
     * <p>The storage encryption algorithm. AES-256-GCM is supported. If you do not specify this parameter, the default algorithm is used.</p>
     * 
     * <strong>example:</strong>
     * <p>AES-256-GCM</p>
     */
    @NameInMap("SseAlgorithm")
    public String sseAlgorithm;

    /**
     * <p>The storage encryption method. Valid values: SMQ and KMS.</p>
     * 
     * <strong>example:</strong>
     * <p>KMS</p>
     */
    @NameInMap("SseType")
    public String sseType;

    /**
     * <p>The list of resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateQueueShrinkRequestTag> tag;

    /**
     * <p>The throttling policy.</p>
     */
    @NameInMap("TenantRateLimitPolicy")
    public String tenantRateLimitPolicyShrink;

    /**
     * <p>The duration for which a message remains in the inactive state after it is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("VisibilityTimeout")
    public Long visibilityTimeout;

    public static CreateQueueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueShrinkRequest self = new CreateQueueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueShrinkRequest setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    public CreateQueueShrinkRequest setDlqPolicyShrink(String dlqPolicyShrink) {
        this.dlqPolicyShrink = dlqPolicyShrink;
        return this;
    }
    public String getDlqPolicyShrink() {
        return this.dlqPolicyShrink;
    }

    public CreateQueueShrinkRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public CreateQueueShrinkRequest setEnableSSE(Boolean enableSSE) {
        this.enableSSE = enableSSE;
        return this;
    }
    public Boolean getEnableSSE() {
        return this.enableSSE;
    }

    public CreateQueueShrinkRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateQueueShrinkRequest setMaximumMessageSize(Long maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    public CreateQueueShrinkRequest setMessageRetentionPeriod(Long messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public CreateQueueShrinkRequest setPollingWaitSeconds(Long pollingWaitSeconds) {
        this.pollingWaitSeconds = pollingWaitSeconds;
        return this;
    }
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    public CreateQueueShrinkRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateQueueShrinkRequest setQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }
    public String getQueueType() {
        return this.queueType;
    }

    public CreateQueueShrinkRequest setSseAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
        return this;
    }
    public String getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public CreateQueueShrinkRequest setSseType(String sseType) {
        this.sseType = sseType;
        return this;
    }
    public String getSseType() {
        return this.sseType;
    }

    public CreateQueueShrinkRequest setTag(java.util.List<CreateQueueShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateQueueShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateQueueShrinkRequest setTenantRateLimitPolicyShrink(String tenantRateLimitPolicyShrink) {
        this.tenantRateLimitPolicyShrink = tenantRateLimitPolicyShrink;
        return this;
    }
    public String getTenantRateLimitPolicyShrink() {
        return this.tenantRateLimitPolicyShrink;
    }

    public CreateQueueShrinkRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static class CreateQueueShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
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

        public static CreateQueueShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateQueueShrinkRequestTag self = new CreateQueueShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateQueueShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQueueShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
