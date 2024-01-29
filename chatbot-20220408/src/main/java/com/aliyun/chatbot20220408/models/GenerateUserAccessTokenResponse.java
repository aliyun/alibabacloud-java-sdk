// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GenerateUserAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUserAccessTokenResponseBody body;

    public static GenerateUserAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserAccessTokenResponse self = new GenerateUserAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUserAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUserAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUserAccessTokenResponse setBody(GenerateUserAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUserAccessTokenResponseBody getBody() {
        return this.body;
    }

}
