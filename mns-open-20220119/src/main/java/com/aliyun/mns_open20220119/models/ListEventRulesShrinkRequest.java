// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListEventRulesShrinkRequest extends TeaModel {
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
    public String subscriptionShrink;

    @NameInMap("TopicName")
    public String topicName;

    public static ListEventRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventRulesShrinkRequest self = new ListEventRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEventRulesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventRulesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventRulesShrinkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListEventRulesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEventRulesShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListEventRulesShrinkRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListEventRulesShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListEventRulesShrinkRequest setSubscriptionShrink(String subscriptionShrink) {
        this.subscriptionShrink = subscriptionShrink;
        return this;
    }
    public String getSubscriptionShrink() {
        return this.subscriptionShrink;
    }

    public ListEventRulesShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
