// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateQueueShrinkRequest extends TeaModel {
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    @NameInMap("DlqPolicy")
    public String dlqPolicyShrink;

    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("EnableSSE")
    public Boolean enableSSE;

    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    @NameInMap("MaximumMessageSize")
    public Long maximumMessageSize;

    @NameInMap("MessageRetentionPeriod")
    public Long messageRetentionPeriod;

    @NameInMap("PollingWaitSeconds")
    public Long pollingWaitSeconds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("QueueType")
    public String queueType;

    @NameInMap("SseAlgorithm")
    public String sseAlgorithm;

    @NameInMap("SseType")
    public String sseType;

    @NameInMap("Tag")
    public java.util.List<CreateQueueShrinkRequestTag> tag;

    @NameInMap("TenantRateLimitPolicy")
    public String tenantRateLimitPolicyShrink;

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
        @NameInMap("Key")
        public String key;

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
