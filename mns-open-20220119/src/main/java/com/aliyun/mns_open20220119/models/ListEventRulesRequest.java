// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListEventRulesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Subscription")
    public ListEventRulesRequestSubscription subscription;

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
        @NameInMap("EndpointType")
        public String endpointType;

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
