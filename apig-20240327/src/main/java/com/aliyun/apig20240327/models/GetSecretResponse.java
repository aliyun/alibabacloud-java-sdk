// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretResponseBody body;

    public static GetSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretResponse self = new GetSecretResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretResponse setBody(GetSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretResponseBody getBody() {
        return this.body;
    }

}
