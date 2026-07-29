// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListSubscriptionByTopicRequest extends TeaModel {
    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("EndpointValue")
    public String endpointValue;

    /**
     * <p>The page number of the results to return.
     * Valid values: 1 to 100000000.
     * If the value is less than 1, the system uses 1. If the value is greater than 100000000, the system uses 100000000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries to return on each page.
     * Valid values: 10 to 50.
     * If the value is less than 10, the system uses 10. If the value is greater than 50, the system uses 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The subscription name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-subscription</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    /**
     * <p>The topic name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
