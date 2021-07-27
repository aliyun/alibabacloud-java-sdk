// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("maxResults")
    public Long maxResults;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

}
