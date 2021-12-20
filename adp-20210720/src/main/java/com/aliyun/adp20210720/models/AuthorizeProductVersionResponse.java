// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AuthorizeProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeProductVersionResponseBody body;

    public static AuthorizeProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductVersionResponse self = new AuthorizeProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeProductVersionResponse setBody(AuthorizeProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeProductVersionResponseBody getBody() {
        return this.body;
    }

}
