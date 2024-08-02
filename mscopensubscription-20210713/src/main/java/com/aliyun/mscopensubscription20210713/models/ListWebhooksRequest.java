// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListWebhooksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&amp;Filter.1.Name=InstanceName&amp;Filter.1.Value.1=i-a123&amp;Filter.1.Value.2=i-b123&amp;Filter.2.Name=Status&amp;Filter.2.Value=Stopped</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <strong>example:</strong>
     * <p>100a</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>abc-def</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("WebhookId")
    public Long webhookId;

    public static ListWebhooksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebhooksRequest self = new ListWebhooksRequest();
        return TeaModel.build(map, self);
    }

    public ListWebhooksRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListWebhooksRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public ListWebhooksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWebhooksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWebhooksRequest setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

}
