// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListNamespacesRequest extends TeaModel {
    /**
     * <p>The data catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesRequest self = new ListNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespacesRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public ListNamespacesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListNamespacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
