// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListCustomDomainsRequest extends TeaModel {
    /**
     * <p>The number of custom domain names returned.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The domain name prefix.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    public static ListCustomDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsRequest self = new ListCustomDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListCustomDomainsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomDomainsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
