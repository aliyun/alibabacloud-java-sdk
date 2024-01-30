// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryEccInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEccInfoResponseBody body;

    public static QueryEccInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEccInfoResponse self = new QueryEccInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEccInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEccInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEccInfoResponse setBody(QueryEccInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEccInfoResponseBody getBody() {
        return this.body;
    }

}
