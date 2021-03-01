// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AuthorizeApplicationResponse setBody(AuthorizeApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeApplicationResponseBody getBody() {
        return this.body;
    }

}
