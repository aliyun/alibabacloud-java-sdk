// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryHotelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHotelsResponseBody body;

    public static QueryHotelsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelsResponse self = new QueryHotelsResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotelsResponse setBody(QueryHotelsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotelsResponseBody getBody() {
        return this.body;
    }

}
