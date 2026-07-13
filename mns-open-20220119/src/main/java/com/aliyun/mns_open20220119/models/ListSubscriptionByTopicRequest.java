// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListSubscriptionByTopicRequest extends TeaModel {
    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("EndpointValue")
    public String endpointValue;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SubscriptionName")
    public String subscriptionName;

    @NameInMap("TopicName")
    public String topicName;

    public static ListSubscriptionByTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByTopicRequest self = new ListSubscriptionByTopicRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByTopicRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public ListSubscriptionByTopicRequest setEndpointValue(String endpointValue) {
        this.endpointValue = endpointValue;
        return this;
    }
    public String getEndpointValue() {
        return this.endpointValue;
    }

    public ListSubscriptionByTopicRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSubscriptionByTopicRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSubscriptionByTopicRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public ListSubscriptionByTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
