// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDentryResponseBody body;

    public static QueryDentryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDentryResponse self = new QueryDentryResponse();
        return TeaModel.build(map, self);
    }

    public QueryDentryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDentryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDentryResponse setBody(QueryDentryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDentryResponseBody getBody() {
        return this.body;
    }

}
