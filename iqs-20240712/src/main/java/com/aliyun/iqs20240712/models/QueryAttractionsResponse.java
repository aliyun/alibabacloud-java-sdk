// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryAttractionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAttractionsResponseBody body;

    public static QueryAttractionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttractionsResponse self = new QueryAttractionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttractionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttractionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttractionsResponse setBody(QueryAttractionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttractionsResponseBody getBody() {
        return this.body;
    }

}
