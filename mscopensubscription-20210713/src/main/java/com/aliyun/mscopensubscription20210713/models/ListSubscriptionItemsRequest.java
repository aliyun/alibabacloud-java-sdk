// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemsRequest extends TeaModel {
    @NameInMap("Filter")
    public String filter;

    @NameInMap("ItemId")
    public Integer itemId;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListSubscriptionItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionItemsRequest self = new ListSubscriptionItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionItemsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListSubscriptionItemsRequest setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }
    public Integer getItemId() {
        return this.itemId;
    }

    public ListSubscriptionItemsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public ListSubscriptionItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSubscriptionItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
