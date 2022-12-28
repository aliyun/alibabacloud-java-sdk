// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class EnableAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAccessTokenResponseBody body;

    public static EnableAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessTokenResponse self = new EnableAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public EnableAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAccessTokenResponse setBody(EnableAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAccessTokenResponseBody getBody() {
        return this.body;
    }

}
