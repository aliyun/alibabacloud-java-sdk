// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    @NameInMap("DlqPolicy")
    public CreateQueueRequestDlqPolicy dlqPolicy;

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
    public java.util.List<CreateQueueRequestTag> tag;

    @NameInMap("TenantRateLimitPolicy")
    public CreateQueueRequestTenantRateLimitPolicy tenantRateLimitPolicy;

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

    public CreateQueueRequest setEnableSSE(Boolean enableSSE) {
        this.enableSSE = enableSSE;
        return this;
    }
    public Boolean getEnableSSE() {
        return this.enableSSE;
    }

    public CreateQueueRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
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

    public CreateQueueRequest setQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }
    public String getQueueType() {
        return this.queueType;
    }

    public CreateQueueRequest setSseAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
        return this;
    }
    public String getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public CreateQueueRequest setSseType(String sseType) {
        this.sseType = sseType;
        return this;
    }
    public String getSseType() {
        return this.sseType;
    }

    public CreateQueueRequest setTag(java.util.List<CreateQueueRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateQueueRequestTag> getTag() {
        return this.tag;
    }

    public CreateQueueRequest setTenantRateLimitPolicy(CreateQueueRequestTenantRateLimitPolicy tenantRateLimitPolicy) {
        this.tenantRateLimitPolicy = tenantRateLimitPolicy;
        return this;
    }
    public CreateQueueRequestTenantRateLimitPolicy getTenantRateLimitPolicy() {
        return this.tenantRateLimitPolicy;
    }

    public CreateQueueRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static class CreateQueueRequestDlqPolicy extends TeaModel {
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Key")
        public String key;

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

    public static class CreateQueueRequestTenantRateLimitPolicy extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceivesPerSecond")
        public Integer maxReceivesPerSecond;

        public static CreateQueueRequestTenantRateLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateQueueRequestTenantRateLimitPolicy self = new CreateQueueRequestTenantRateLimitPolicy();
            return TeaModel.build(map, self);
        }

        public CreateQueueRequestTenantRateLimitPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateQueueRequestTenantRateLimitPolicy setMaxReceivesPerSecond(Integer maxReceivesPerSecond) {
            this.maxReceivesPerSecond = maxReceivesPerSecond;
            return this;
        }
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

    }

}
