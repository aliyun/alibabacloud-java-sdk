// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryUserDeleteStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserDeleteStatusResponseBody body;

    public static QueryUserDeleteStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDeleteStatusResponse self = new QueryUserDeleteStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserDeleteStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserDeleteStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserDeleteStatusResponse setBody(QueryUserDeleteStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserDeleteStatusResponseBody getBody() {
        return this.body;
    }

}
