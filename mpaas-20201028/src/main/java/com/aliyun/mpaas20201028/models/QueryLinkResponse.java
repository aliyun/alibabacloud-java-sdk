// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLinkResponseBody body;

    public static QueryLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkResponse self = new QueryLinkResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLinkResponse setBody(QueryLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkResponseBody getBody() {
        return this.body;
    }

}
