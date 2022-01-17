// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class QueryMarketCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMarketCategoriesResponseBody body;

    public static QueryMarketCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketCategoriesResponse self = new QueryMarketCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMarketCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMarketCategoriesResponse setBody(QueryMarketCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMarketCategoriesResponseBody getBody() {
        return this.body;
    }

}
