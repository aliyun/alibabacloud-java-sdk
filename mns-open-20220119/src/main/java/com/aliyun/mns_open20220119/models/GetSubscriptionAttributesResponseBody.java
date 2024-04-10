// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetSubscriptionAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetSubscriptionAttributesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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

    public static class GetSubscriptionAttributesResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("FilterTag")
        public String filterTag;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("NotifyContentFormat")
        public String notifyContentFormat;

        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        @NameInMap("SubscriptionName")
        public String subscriptionName;

        @NameInMap("TopicName")
        public String topicName;

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
