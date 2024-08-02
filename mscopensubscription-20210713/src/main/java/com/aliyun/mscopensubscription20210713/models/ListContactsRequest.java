// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListContactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <strong>example:</strong>
     * <p>Stopped：&amp;Filter.1.Name=InstanceName&amp;Filter.1.Value.1=i-a123&amp;Filter.1.Value.2=i-b123&amp;Filter.2.Name=Status&amp;Filter.2.Value=Stoppe</p>
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

    public static ListContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactsRequest self = new ListContactsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactsRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public ListContactsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListContactsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public ListContactsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContactsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
