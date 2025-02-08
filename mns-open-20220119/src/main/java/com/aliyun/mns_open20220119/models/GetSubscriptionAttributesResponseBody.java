// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetSubscriptionAttributesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSubscriptionAttributesResponseBodyData data;

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

    public static GetSubscriptionAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionAttributesResponseBody self = new GetSubscriptionAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSubscriptionAttributesResponseBody setData(GetSubscriptionAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionAttributesResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSubscriptionAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionAttributesResponseBodyDataDlqPolicy extends TeaModel {
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static GetSubscriptionAttributesResponseBodyDataDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionAttributesResponseBodyDataDlqPolicy self = new GetSubscriptionAttributesResponseBodyDataDlqPolicy();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionAttributesResponseBodyDataDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public GetSubscriptionAttributesResponseBodyDataDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetSubscriptionAttributesResponseBodyData extends TeaModel {
        /**
         * <p>The time when the subscription was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554806</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DlqPolicy")
        public GetSubscriptionAttributesResponseBodyDataDlqPolicy dlqPolicy;

        /**
         * <p>The endpoint to which the messages are pushed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The tag that is used to filter messages. Only the messages that are attached with the specified tag can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>important</p>
         */
        @NameInMap("FilterTag")
        public String filterTag;

        /**
         * <p>The time when the subscription was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554962</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The content format of the messages that are pushed to the endpoint. Valid values:</p>
         * <ul>
         * <li>XML</li>
         * <li>JSON</li>
         * <li>SIMPLIFIED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XML</p>
         */
        @NameInMap("NotifyContentFormat")
        public String notifyContentFormat;

        /**
         * <p>The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:</p>
         * <ul>
         * <li>BACKOFF_RETRY</li>
         * <li>EXPONENTIAL_DECAY_RETRY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        /**
         * <p>The name of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>MySubscription</p>
         */
        @NameInMap("SubscriptionName")
        public String subscriptionName;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTopic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The Alibaba Cloud account ID of the topic owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789098****</p>
         */
        @NameInMap("TopicOwner")
        public String topicOwner;

        public static GetSubscriptionAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionAttributesResponseBodyData self = new GetSubscriptionAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionAttributesResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetSubscriptionAttributesResponseBodyData setDlqPolicy(GetSubscriptionAttributesResponseBodyDataDlqPolicy dlqPolicy) {
            this.dlqPolicy = dlqPolicy;
            return this;
        }
        public GetSubscriptionAttributesResponseBodyDataDlqPolicy getDlqPolicy() {
            return this.dlqPolicy;
        }

        public GetSubscriptionAttributesResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetSubscriptionAttributesResponseBodyData setFilterTag(String filterTag) {
            this.filterTag = filterTag;
            return this;
        }
        public String getFilterTag() {
            return this.filterTag;
        }

        public GetSubscriptionAttributesResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetSubscriptionAttributesResponseBodyData setNotifyContentFormat(String notifyContentFormat) {
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }
        public String getNotifyContentFormat() {
            return this.notifyContentFormat;
        }

        public GetSubscriptionAttributesResponseBodyData setNotifyStrategy(String notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public GetSubscriptionAttributesResponseBodyData setSubscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        public GetSubscriptionAttributesResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetSubscriptionAttributesResponseBodyData setTopicOwner(String topicOwner) {
            this.topicOwner = topicOwner;
            return this;
        }
        public String getTopicOwner() {
            return this.topicOwner;
        }

    }

}
