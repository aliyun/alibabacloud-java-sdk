// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerScopesToClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeResourceServerScopesToClientResponseBody body;

    public static AuthorizeResourceServerScopesToClientResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerScopesToClientResponse self = new AuthorizeResourceServerScopesToClientResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerScopesToClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceServerScopesToClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeResourceServerScopesToClientResponse setBody(AuthorizeResourceServerScopesToClientResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceServerScopesToClientResponseBody getBody() {
        return this.body;
    }

}
