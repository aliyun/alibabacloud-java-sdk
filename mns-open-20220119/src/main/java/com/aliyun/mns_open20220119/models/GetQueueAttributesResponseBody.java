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

    public static class GetQueueAttributesResponseBodyData extends TeaModel {
        @NameInMap("ActiveMessages")
        public Long activeMessages;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DelayMessages")
        public Long delayMessages;

        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        @NameInMap("InactiveMessages")
        public Long inactiveMessages;

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

        public GetQueueAttributesResponseBodyData setVisibilityTimeout(Long visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }
        public Long getVisibilityTimeout() {
            return this.visibilityTimeout;
        }

    }

}
