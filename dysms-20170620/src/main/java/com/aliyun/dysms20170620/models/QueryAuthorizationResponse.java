// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuthorizationResponseBody body;

    public static QueryAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthorizationResponse self = new QueryAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuthorizationResponse setBody(QueryAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthorizationResponseBody getBody() {
        return this.body;
    }

}
