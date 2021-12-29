// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeBaaSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeBaaSResponseBody body;

    public static AuthorizeBaaSResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeBaaSResponse self = new AuthorizeBaaSResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeBaaSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeBaaSResponse setBody(AuthorizeBaaSResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeBaaSResponseBody getBody() {
        return this.body;
    }

}
