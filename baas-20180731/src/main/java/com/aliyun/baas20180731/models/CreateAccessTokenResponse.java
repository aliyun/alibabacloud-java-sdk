// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessTokenResponseBody body;

    public static CreateAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessTokenResponse self = new CreateAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessTokenResponse setBody(CreateAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessTokenResponseBody getBody() {
        return this.body;
    }

}
