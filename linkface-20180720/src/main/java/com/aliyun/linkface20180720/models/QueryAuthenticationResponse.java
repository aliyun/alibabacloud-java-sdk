// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryAuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuthenticationResponseBody body;

    public static QueryAuthenticationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthenticationResponse self = new QueryAuthenticationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthenticationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthenticationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuthenticationResponse setBody(QueryAuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthenticationResponseBody getBody() {
        return this.body;
    }

}
