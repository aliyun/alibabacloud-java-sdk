// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListAuthenticationTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthenticationTokensResponseBody body;

    public static ListAuthenticationTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticationTokensResponse self = new ListAuthenticationTokensResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthenticationTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthenticationTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthenticationTokensResponse setBody(ListAuthenticationTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthenticationTokensResponseBody getBody() {
        return this.body;
    }

}
