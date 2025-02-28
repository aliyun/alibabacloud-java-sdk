// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceEgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeInstanceEgressResponseBody body;

    public static AuthorizeInstanceEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceEgressResponse self = new AuthorizeInstanceEgressResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceEgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeInstanceEgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeInstanceEgressResponse setBody(AuthorizeInstanceEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeInstanceEgressResponseBody getBody() {
        return this.body;
    }

}
