// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AuthorizationSaveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizationSaveResponseBody body;

    public static AuthorizationSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationSaveResponse self = new AuthorizationSaveResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizationSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizationSaveResponse setBody(AuthorizationSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizationSaveResponseBody getBody() {
        return this.body;
    }

}
