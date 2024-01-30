// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeApplicationResponseBody body;

    public static AuthorizeApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationResponse self = new AuthorizeApplicationResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeApplicationResponse setBody(AuthorizeApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeApplicationResponseBody getBody() {
        return this.body;
    }

}
