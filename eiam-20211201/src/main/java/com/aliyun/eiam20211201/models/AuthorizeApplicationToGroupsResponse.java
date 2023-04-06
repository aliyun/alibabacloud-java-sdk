// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeApplicationToGroupsResponseBody body;

    public static AuthorizeApplicationToGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToGroupsResponse self = new AuthorizeApplicationToGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeApplicationToGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeApplicationToGroupsResponse setBody(AuthorizeApplicationToGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeApplicationToGroupsResponseBody getBody() {
        return this.body;
    }

}
