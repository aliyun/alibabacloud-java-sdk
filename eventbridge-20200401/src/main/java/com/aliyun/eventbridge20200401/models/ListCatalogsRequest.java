// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListCatalogsRequest extends TeaModel {
    /**
     * <p>Items per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>Pagination token</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsRequest self = new ListCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListCatalogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
