// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&amp;Filter.1.Name=InstanceName&amp;Filter.1.Value.1=i-a123&amp;Filter.1.Value.2=i-b123&amp;Filter.2.Name=Status&amp;Filter.2.Value=Stopped</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ItemId")
    public Integer itemId;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>abc-def</p>
     */
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
