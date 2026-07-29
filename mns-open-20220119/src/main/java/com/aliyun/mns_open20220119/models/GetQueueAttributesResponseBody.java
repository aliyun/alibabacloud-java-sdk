// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetQueueAttributesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetQueueAttributesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The target queue for dead-letter message delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>deadLetterTargetQueue</p>
         */
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        /**
         * <p>Indicates whether dead-letter message delivery is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of times a message can be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>Specifies whether rate limiting is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of receives per second.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <p>The approximate total number of messages in the Active state in the queue.</p>
         * <p><warning>This field will be deprecated and defaults to 0. Use the CloudMonitor API to retrieve this metric instead.</warning></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveMessages")
        public Long activeMessages;

        /**
         * <p>The time when the queue was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700999</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The approximate total number of messages in the Delayed state in the queue.</p>
         * <p><warning>This field will be deprecated and defaults to 0. Use the CloudMonitor API to retrieve this metric instead.</warning></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelayMessages")
        public Long delayMessages;

        /**
         * <p>The delay period for all messages sent to the queue. Messages sent to the queue can be consumed only after the delay period specified by this parameter elapses. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        /**
         * <p>The dead-letter queue policy.</p>
         */
        @NameInMap("DlqPolicy")
        public GetQueueAttributesResponseBodyDataDlqPolicy dlqPolicy;

        @NameInMap("EnableSSE")
        public Boolean enableSSE;

        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        /**
         * <p>The approximate total number of messages in the Inactive state in the queue.</p>
         * <p><warning>This field will be deprecated and defaults to 0. Use the CloudMonitor API to retrieve this metric instead.</warning></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InactiveMessages")
        public Long inactiveMessages;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The most recent time when the queue attributes were modified. The value is a UNIX timestamp representing the number of seconds elapsed since 1970-01-01 00:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700999</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>Indicates whether the log management feature is enabled.</p>
         * <ul>
         * <li><p>True: Enabled.</p>
         * </li>
         * <li><p>False: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        /**
         * <p>The maximum length of the message body sent to the queue. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MaximumMessageSize")
        public Long maximumMessageSize;

        /**
         * <p>The maximum duration for which a message is retained in the queue. After the period specified by this parameter elapses since the message is sent to the queue, the message is deleted regardless of whether it has been consumed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        /**
         * <p>The maximum wait time for a ReceiveMessage request on the queue when the queue has no messages. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PollingWaitSeconds")
        public Long pollingWaitSeconds;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-queue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The type of the queue. Valid values:</p>
         * <ul>
         * <li>normal: standard queue</li>
         * <li>fifo: FIFO queue</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("SseAlgorithm")
        public String sseAlgorithm;

        @NameInMap("SseType")
        public String sseType;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetQueueAttributesResponseBodyDataTags> tags;

        /**
         * <p>The rate limiting policy.</p>
         */
        @NameInMap("TenantRateLimitPolicy")
        public GetQueueAttributesResponseBodyDataTenantRateLimitPolicy tenantRateLimitPolicy;

        /**
         * <p>The duration for which a message stays in the Inactive state after it is consumed from the queue and changes from the Active state to the Inactive state.
         * Valid values: 1 to 43200. Unit: seconds.
         * Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
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
