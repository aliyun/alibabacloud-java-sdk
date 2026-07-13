// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetSubscriptionAttributesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    /**
     * <p>This parameter is required.</p>
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
