// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeUsersForAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeUsersForAppResponseBody body;

    public static AuthorizeUsersForAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeUsersForAppResponse self = new AuthorizeUsersForAppResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeUsersForAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeUsersForAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeUsersForAppResponse setBody(AuthorizeUsersForAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeUsersForAppResponseBody getBody() {
        return this.body;
    }

}
