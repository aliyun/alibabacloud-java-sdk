// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AuthorizeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeAppResponseBody body;

    public static AuthorizeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppResponse self = new AuthorizeAppResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeAppResponse setBody(AuthorizeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeAppResponseBody getBody() {
        return this.body;
    }

}
