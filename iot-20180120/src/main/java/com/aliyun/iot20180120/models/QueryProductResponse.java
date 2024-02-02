// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductResponseBody body;

    public static QueryProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductResponse self = new QueryProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductResponse setBody(QueryProductResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductResponseBody getBody() {
        return this.body;
    }

}
