// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListSubscriptionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>123-123-234-345-123</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("subscriptionList")
    public java.util.List<SubscriptionForView> subscriptionList;

    public static ListSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsResponseBody self = new ListSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSubscriptionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionsResponseBody setSubscriptionList(java.util.List<SubscriptionForView> subscriptionList) {
        this.subscriptionList = subscriptionList;
        return this;
    }
    public java.util.List<SubscriptionForView> getSubscriptionList() {
        return this.subscriptionList;
    }

}
