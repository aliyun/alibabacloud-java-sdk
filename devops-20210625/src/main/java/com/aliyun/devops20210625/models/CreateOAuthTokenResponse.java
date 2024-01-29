// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateOAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOAuthTokenResponseBody body;

    public static CreateOAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuthTokenResponse self = new CreateOAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateOAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOAuthTokenResponse setBody(CreateOAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOAuthTokenResponseBody getBody() {
        return this.body;
    }

}
