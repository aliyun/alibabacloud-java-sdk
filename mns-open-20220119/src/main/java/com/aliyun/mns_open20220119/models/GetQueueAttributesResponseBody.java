// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetQueueAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetQueueAttributesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static GetQueueAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueAttributesResponseBody self = new GetQueueAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetQueueAttributesResponseBody setData(GetQueueAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueueAttributesResponseBodyData getData() {
        return this.data;
    }

    public GetQueueAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueueAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQueueAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQueueAttributesResponseBodyDataDlqPolicy extends TeaModel {
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceiveCount")
        public String maxReceiveCount;

        public static GetQueueAttributesResponseBodyDataDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQueueAttributesResponseBodyDataDlqPolicy self = new GetQueueAttributesResponseBodyDataDlqPolicy();
            return TeaModel.build(map, self);
        }

        public GetQueueAttributesResponseBodyDataDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public GetQueueAttributesResponseBodyDataDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetQueueAttributesResponseBodyDataDlqPolicy setMaxReceiveCount(String maxReceiveCount) {
            this.maxReceiveCount = maxReceiveCount;
            return this;
        }
        public String getMaxReceiveCount() {
            return this.maxReceiveCount;
        }

    }

    public static class GetQueueAttributesResponseBodyDataTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetQueueAttributesResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetQueueAttributesResponseBodyDataTags self = new GetQueueAttributesResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetQueueAttributesResponseBodyDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetQueueAttributesResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetQueueAttributesResponseBodyDataTenantRateLimitPolicy extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceivesPerSecond")
        public Integer maxReceivesPerSecond;

        public static GetQueueAttributesResponseBodyDataTenantRateLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQueueAttributesResponseBodyDataTenantRateLimitPolicy self = new GetQueueAttributesResponseBodyDataTenantRateLimitPolicy();
            return TeaModel.build(map, self);
        }

        public GetQueueAttributesResponseBodyDataTenantRateLimitPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetQueueAttributesResponseBodyDataTenantRateLimitPolicy setMaxReceivesPerSecond(Integer maxReceivesPerSecond) {
            this.maxReceivesPerSecond = maxReceivesPerSecond;
            return this;
        }
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

    }

    public static class GetQueueAttributesResponseBodyData extends TeaModel {
        @NameInMap("ActiveMessages")
        public Long activeMessages;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DelayMessages")
        public Long delayMessages;

        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        @NameInMap("DlqPolicy")
        public GetQueueAttributesResponseBodyDataDlqPolicy dlqPolicy;

        @NameInMap("EnableSSE")
        public Boolean enableSSE;

        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        @NameInMap("InactiveMessages")
        public Long inactiveMessages;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        @NameInMap("MaximumMessageSize")
        public Long maximumMessageSize;

        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        @NameInMap("PollingWaitSeconds")
        public Long pollingWaitSeconds;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("SseAlgorithm")
        public String sseAlgorithm;

        @NameInMap("SseType")
        public String sseType;

        @NameInMap("Tags")
        public java.util.List<GetQueueAttributesResponseBodyDataTags> tags;

        @NameInMap("TenantRateLimitPolicy")
        public GetQueueAttributesResponseBodyDataTenantRateLimitPolicy tenantRateLimitPolicy;

        @NameInMap("VisibilityTimeout")
        public Long visibilityTimeout;

        public static GetQueueAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueueAttributesResponseBodyData self = new GetQueueAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueueAttributesResponseBodyData setActiveMessages(Long activeMessages) {
            this.activeMessages = activeMessages;
            return this;
        }
        public Long getActiveMessages() {
            return this.activeMessages;
        }

        public GetQueueAttributesResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQueueAttributesResponseBodyData setDelayMessages(Long delayMessages) {
            this.delayMessages = delayMessages;
            return this;
        }
        public Long getDelayMessages() {
            return this.delayMessages;
        }

        public GetQueueAttributesResponseBodyData setDelaySeconds(Long delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        public GetQueueAttributesResponseBodyData setDlqPolicy(GetQueueAttributesResponseBodyDataDlqPolicy dlqPolicy) {
            this.dlqPolicy = dlqPolicy;
            return this;
        }
        public GetQueueAttributesResponseBodyDataDlqPolicy getDlqPolicy() {
            return this.dlqPolicy;
        }

        public GetQueueAttributesResponseBodyData setEnableSSE(Boolean enableSSE) {
            this.enableSSE = enableSSE;
            return this;
        }
        public Boolean getEnableSSE() {
            return this.enableSSE;
        }

        public GetQueueAttributesResponseBodyData setEncryptionEnabled(Boolean encryptionEnabled) {
            this.encryptionEnabled = encryptionEnabled;
            return this;
        }
        public Boolean getEncryptionEnabled() {
            return this.encryptionEnabled;
        }

        public GetQueueAttributesResponseBodyData setInactiveMessages(Long inactiveMessages) {
            this.inactiveMessages = inactiveMessages;
            return this;
        }
        public Long getInactiveMessages() {
            return this.inactiveMessages;
        }

        public GetQueueAttributesResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetQueueAttributesResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetQueueAttributesResponseBodyData setLoggingEnabled(Boolean loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }
        public Boolean getLoggingEnabled() {
            return this.loggingEnabled;
        }

        public GetQueueAttributesResponseBodyData setMaximumMessageSize(Long maximumMessageSize) {
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }
        public Long getMaximumMessageSize() {
            return this.maximumMessageSize;
        }

        public GetQueueAttributesResponseBodyData setMessageRetentionPeriod(Long messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        public GetQueueAttributesResponseBodyData setPollingWaitSeconds(Long pollingWaitSeconds) {
            this.pollingWaitSeconds = pollingWaitSeconds;
            return this;
        }
        public Long getPollingWaitSeconds() {
            return this.pollingWaitSeconds;
        }

        public GetQueueAttributesResponseBodyData setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetQueueAttributesResponseBodyData setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public GetQueueAttributesResponseBodyData setSseAlgorithm(String sseAlgorithm) {
            this.sseAlgorithm = sseAlgorithm;
            return this;
        }
        public String getSseAlgorithm() {
            return this.sseAlgorithm;
        }

        public GetQueueAttributesResponseBodyData setSseType(String sseType) {
            this.sseType = sseType;
            return this;
        }
        public String getSseType() {
            return this.sseType;
        }

        public GetQueueAttributesResponseBodyData setTags(java.util.List<GetQueueAttributesResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetQueueAttributesResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetQueueAttributesResponseBodyData setTenantRateLimitPolicy(GetQueueAttributesResponseBodyDataTenantRateLimitPolicy tenantRateLimitPolicy) {
            this.tenantRateLimitPolicy = tenantRateLimitPolicy;
            return this;
        }
        public GetQueueAttributesResponseBodyDataTenantRateLimitPolicy getTenantRateLimitPolicy() {
            return this.tenantRateLimitPolicy;
        }

        public GetQueueAttributesResponseBodyData setVisibilityTimeout(Long visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }
        public Long getVisibilityTimeout() {
            return this.visibilityTimeout;
        }

    }

}
