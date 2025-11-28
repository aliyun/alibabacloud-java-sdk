// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeBaaSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AuthorizeBaaSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeBaaSResponse setBody(AuthorizeBaaSResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeBaaSResponseBody getBody() {
        return this.body;
    }

}
