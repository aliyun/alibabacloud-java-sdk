// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemsResponseBody body;

    public static QueryItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemsResponse self = new QueryItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemsResponse setBody(QueryItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemsResponseBody getBody() {
        return this.body;
    }

}
