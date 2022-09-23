// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryRingTonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRingTonesResponseBody body;

    public static QueryRingTonesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRingTonesResponse self = new QueryRingTonesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRingTonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRingTonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRingTonesResponse setBody(QueryRingTonesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRingTonesResponseBody getBody() {
        return this.body;
    }

}
