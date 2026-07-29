// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListEventRulesRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use PageSize for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is deprecated. Use PageNum for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>cd7NlPlX4kgKCdsCWMiMR/+HnVzPLQ4/XLvjR64jZ7F9AQ+Mr3T59J6IVkuXeV3w</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the results to return.
     * Valid values: 1 to 100000.
     * If you set this parameter to a value less than 1, the system uses 1. If you set this parameter to a value greater than 100000, the system uses 100000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries to return on each page.
     * Valid values: 10 to 50.
     * If you set this parameter to a value less than 10, the system uses 10. If you set this parameter to a value greater than 50, the system uses 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the Alibaba Cloud service for which event notifications are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The resource name in the matching rule. This parameter is used to filter rules. For example, for Object Storage Service (OSS), this is the bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-bucket</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-xsXDW</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The subscriber.</p>
     */
    @NameInMap("Subscription")
    public ListEventRulesRequestSubscription subscription;

    /**
     * <p>The name of the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>test-topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static ListEventRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventRulesRequest self = new ListEventRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListEventRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventRulesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListEventRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEventRulesRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListEventRulesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListEventRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListEventRulesRequest setSubscription(ListEventRulesRequestSubscription subscription) {
        this.subscription = subscription;
        return this;
    }
    public ListEventRulesRequestSubscription getSubscription() {
        return this.subscription;
    }

    public ListEventRulesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class ListEventRulesRequestSubscription extends TeaModel {
        /**
         * <p>The endpoint type. Valid values:</p>
         * <ul>
         * <li><p><strong>topic</strong>: A topic can deliver messages to multiple subscribers. You can add or remove subscribers later.</p>
         * </li>
         * <li><p><strong>queue</strong>: Messages are delivered directly to a queue. This simplifies the delivery path, but you cannot add new subscribers later.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The actual value of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test-topic</p>
         */
        @NameInMap("EndpointValue")
        public String endpointValue;

        public static ListEventRulesRequestSubscription build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesRequestSubscription self = new ListEventRulesRequestSubscription();
            return TeaModel.build(map, self);
        }

        public ListEventRulesRequestSubscription setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListEventRulesRequestSubscription setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

}
