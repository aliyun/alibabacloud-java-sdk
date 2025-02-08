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
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetQueueAttributesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response status.</p>
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
        /**
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
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

    public static class GetQueueAttributesResponseBodyData extends TeaModel {
        /**
         * <p>The total number of messages that are in the Active state in the queue. The value is an approximate value. Default value: 0. We recommend that you do not use the return value and that you call CloudMonitor API operations to query the metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The total number of messages that are in the Delayed state in the queue. The value is an approximate value. Default value: 0. We recommend that you do not use the return value and that you call CloudMonitor API operations to query the metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelayMessages")
        public Long delayMessages;

        /**
         * <p>The period after which all messages sent to the queue are consumed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        @NameInMap("DlqPolicy")
        public GetQueueAttributesResponseBodyDataDlqPolicy dlqPolicy;

        /**
         * <p>The total number of messages that are in the Inactive state in the queue. The value is an approximate value. Default value: 0. We recommend that you do not use the return value and that you call CloudMonitor API operations to query the metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InactiveMessages")
        public Long inactiveMessages;

        /**
         * <p>The time when the queue was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700999</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>Indicates whether the logging feature is enabled. Valid values:</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        /**
         * <p>The maximum length of the message that is sent to the queue. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MaximumMessageSize")
        public Long maximumMessageSize;

        /**
         * <p>The maximum duration for which a message is retained in the queue. After the specified retention period ends, the message is deleted regardless of whether the message is received. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        /**
         * <p>The maximum duration for which long polling requests are held after the ReceiveMessage operation is called. Unit: seconds.</p>
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

        @NameInMap("Tags")
        public java.util.List<GetQueueAttributesResponseBodyDataTags> tags;

        /**
         * <p>The duration for which a message stays in the Inactive state after the message is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.</p>
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

        public GetQueueAttributesResponseBodyData setInactiveMessages(Long inactiveMessages) {
            this.inactiveMessages = inactiveMessages;
            return this;
        }
        public Long getInactiveMessages() {
            return this.inactiveMessages;
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

        public GetQueueAttributesResponseBodyData setTags(java.util.List<GetQueueAttributesResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetQueueAttributesResponseBodyDataTags> getTags() {
            return this.tags;
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
