// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerToClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeResourceServerToClientResponseBody body;

    public static AuthorizeResourceServerToClientResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerToClientResponse self = new AuthorizeResourceServerToClientResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerToClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceServerToClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeResourceServerToClientResponse setBody(AuthorizeResourceServerToClientResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceServerToClientResponseBody getBody() {
        return this.body;
    }

}
