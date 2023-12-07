// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ApplyForStreamAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyForStreamAccessTokenResponseBody body;

    public static ApplyForStreamAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyForStreamAccessTokenResponse self = new ApplyForStreamAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyForStreamAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyForStreamAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyForStreamAccessTokenResponse setBody(ApplyForStreamAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyForStreamAccessTokenResponseBody getBody() {
        return this.body;
    }

}
