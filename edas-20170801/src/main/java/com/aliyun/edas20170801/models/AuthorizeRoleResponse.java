// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeRoleResponseBody body;

    public static AuthorizeRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRoleResponse self = new AuthorizeRoleResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeRoleResponse setBody(AuthorizeRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeRoleResponseBody getBody() {
        return this.body;
    }

}
