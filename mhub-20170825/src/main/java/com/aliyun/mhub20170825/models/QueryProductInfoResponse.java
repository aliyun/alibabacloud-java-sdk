// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryProductInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductInfoResponseBody body;

    public static QueryProductInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInfoResponse self = new QueryProductInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductInfoResponse setBody(QueryProductInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductInfoResponseBody getBody() {
        return this.body;
    }

}
