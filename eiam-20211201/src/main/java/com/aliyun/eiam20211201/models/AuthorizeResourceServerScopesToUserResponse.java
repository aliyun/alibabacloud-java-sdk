// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerScopesToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeResourceServerScopesToUserResponseBody body;

    public static AuthorizeResourceServerScopesToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerScopesToUserResponse self = new AuthorizeResourceServerScopesToUserResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerScopesToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceServerScopesToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeResourceServerScopesToUserResponse setBody(AuthorizeResourceServerScopesToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceServerScopesToUserResponseBody getBody() {
        return this.body;
    }

}
