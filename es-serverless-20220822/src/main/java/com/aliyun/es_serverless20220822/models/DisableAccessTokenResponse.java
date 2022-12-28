// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class DisableAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableAccessTokenResponseBody body;

    public static DisableAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAccessTokenResponse self = new DisableAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public DisableAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAccessTokenResponse setBody(DisableAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAccessTokenResponseBody getBody() {
        return this.body;
    }

}
