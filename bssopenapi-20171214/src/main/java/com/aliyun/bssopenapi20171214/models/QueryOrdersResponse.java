// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrdersResponseBody body;

    public static QueryOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersResponse self = new QueryOrdersResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrdersResponse setBody(QueryOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrdersResponseBody getBody() {
        return this.body;
    }

}
