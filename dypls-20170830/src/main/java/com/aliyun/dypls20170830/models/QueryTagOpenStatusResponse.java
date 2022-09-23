// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryTagOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTagOpenStatusResponseBody body;

    public static QueryTagOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagOpenStatusResponse self = new QueryTagOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagOpenStatusResponse setBody(QueryTagOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagOpenStatusResponseBody getBody() {
        return this.body;
    }

}
