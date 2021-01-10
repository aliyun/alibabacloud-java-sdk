// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttTopicSubscriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Subscription")
    public DescribeMqttTopicSubscriptionResponseBodySubscription subscription;

    public static DescribeMqttTopicSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttTopicSubscriptionResponseBody self = new DescribeMqttTopicSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMqttTopicSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMqttTopicSubscriptionResponseBody setSubscription(DescribeMqttTopicSubscriptionResponseBodySubscription subscription) {
        this.subscription = subscription;
        return this;
    }
    public DescribeMqttTopicSubscriptionResponseBodySubscription getSubscription() {
        return this.subscription;
    }

    public static class DescribeMqttTopicSubscriptionResponseBodySubscription extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Count")
        public Integer count;

        public static DescribeMqttTopicSubscriptionResponseBodySubscription build(java.util.Map<String, ?> map) throws Exception {
            DescribeMqttTopicSubscriptionResponseBodySubscription self = new DescribeMqttTopicSubscriptionResponseBodySubscription();
            return TeaModel.build(map, self);
        }

        public DescribeMqttTopicSubscriptionResponseBodySubscription setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeMqttTopicSubscriptionResponseBodySubscription setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
