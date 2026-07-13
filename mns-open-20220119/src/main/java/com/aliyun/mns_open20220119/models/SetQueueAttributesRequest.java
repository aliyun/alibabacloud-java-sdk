// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetQueueAttributesRequest extends TeaModel {
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    @NameInMap("DlqPolicy")
    public SetQueueAttributesRequestDlqPolicy dlqPolicy;

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

    @NameInMap("SseAlgorithm")
    public String sseAlgorithm;

    @NameInMap("SseType")
    public String sseType;

    @NameInMap("TenantRateLimitPolicy")
    public SetQueueAttributesRequestTenantRateLimitPolicy tenantRateLimitPolicy;

    @NameInMap("VisibilityTimeout")
    public Long visibilityTimeout;

    public static SetQueueAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetQueueAttributesRequest self = new SetQueueAttributesRequest();
        return TeaModel.build(map, self);
    }

    public SetQueueAttributesRequest setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    public SetQueueAttributesRequest setDlqPolicy(SetQueueAttributesRequestDlqPolicy dlqPolicy) {
        this.dlqPolicy = dlqPolicy;
        return this;
    }
    public SetQueueAttributesRequestDlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    public SetQueueAttributesRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public SetQueueAttributesRequest setEnableSSE(Boolean enableSSE) {
        this.enableSSE = enableSSE;
        return this;
    }
    public Boolean getEnableSSE() {
        return this.enableSSE;
    }

    public SetQueueAttributesRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public SetQueueAttributesRequest setMaximumMessageSize(Long maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    public SetQueueAttributesRequest setMessageRetentionPeriod(Long messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public SetQueueAttributesRequest setPollingWaitSeconds(Long pollingWaitSeconds) {
        this.pollingWaitSeconds = pollingWaitSeconds;
        return this;
    }
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    public SetQueueAttributesRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public SetQueueAttributesRequest setSseAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
        return this;
    }
    public String getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public SetQueueAttributesRequest setSseType(String sseType) {
        this.sseType = sseType;
        return this;
    }
    public String getSseType() {
        return this.sseType;
    }

    public SetQueueAttributesRequest setTenantRateLimitPolicy(SetQueueAttributesRequestTenantRateLimitPolicy tenantRateLimitPolicy) {
        this.tenantRateLimitPolicy = tenantRateLimitPolicy;
        return this;
    }
    public SetQueueAttributesRequestTenantRateLimitPolicy getTenantRateLimitPolicy() {
        return this.tenantRateLimitPolicy;
    }

    public SetQueueAttributesRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static class SetQueueAttributesRequestDlqPolicy extends TeaModel {
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceiveCount")
        public Integer maxReceiveCount;

        public static SetQueueAttributesRequestDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetQueueAttributesRequestDlqPolicy self = new SetQueueAttributesRequestDlqPolicy();
            return TeaModel.build(map, self);
        }

        public SetQueueAttributesRequestDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public SetQueueAttributesRequestDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SetQueueAttributesRequestDlqPolicy setMaxReceiveCount(Integer maxReceiveCount) {
            this.maxReceiveCount = maxReceiveCount;
            return this;
        }
        public Integer getMaxReceiveCount() {
            return this.maxReceiveCount;
        }

    }

    public static class SetQueueAttributesRequestTenantRateLimitPolicy extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceivesPerSecond")
        public Integer maxReceivesPerSecond;

        public static SetQueueAttributesRequestTenantRateLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetQueueAttributesRequestTenantRateLimitPolicy self = new SetQueueAttributesRequestTenantRateLimitPolicy();
            return TeaModel.build(map, self);
        }

        public SetQueueAttributesRequestTenantRateLimitPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SetQueueAttributesRequestTenantRateLimitPolicy setMaxReceivesPerSecond(Integer maxReceivesPerSecond) {
            this.maxReceivesPerSecond = maxReceivesPerSecond;
            return this;
        }
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

    }

}
