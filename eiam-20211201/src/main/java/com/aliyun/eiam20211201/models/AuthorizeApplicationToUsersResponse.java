// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeApplicationToUsersResponseBody body;

    public static AuthorizeApplicationToUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToUsersResponse self = new AuthorizeApplicationToUsersResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeApplicationToUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeApplicationToUsersResponse setBody(AuthorizeApplicationToUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeApplicationToUsersResponseBody getBody() {
        return this.body;
    }

}
