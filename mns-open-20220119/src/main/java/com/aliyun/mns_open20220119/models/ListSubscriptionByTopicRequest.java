// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListSubscriptionByTopicRequest extends TeaModel {
    /**
     * <p>The type of the subscription endpoint used to filter results. For queue push, set the value to queue.</p>
     * 
     * <strong>example:</strong>
     * <p>queue</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The address of the subscription endpoint used to filter results. For queue push, specify the queue name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-queue</p>
     */
    @NameInMap("EndpointValue")
    public String endpointValue;

    /**
     * <p>The page number of the returned results. Valid values: 1 to 100000000. If the specified value is less than 1, the system defaults to 1. If the specified value is greater than 100000000, the system defaults to 100000000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 10 to 50. If the specified value is less than 10, the system defaults to 10. If the specified value is greater than 50, the system defaults to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-subscription</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    /**
     * <p>The name of the topic.</p>
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
