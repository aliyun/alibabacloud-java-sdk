// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetSubscriptionAttributesRequest extends TeaModel {
    /**
     * <p>The name of the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySubscription</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    /**
     * <p>The name of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTopic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static GetSubscriptionAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionAttributesRequest self = new GetSubscriptionAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionAttributesRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public GetSubscriptionAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
