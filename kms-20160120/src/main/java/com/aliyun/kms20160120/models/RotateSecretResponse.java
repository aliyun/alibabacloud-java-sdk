// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RotateSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RotateSecretResponseBody body;

    public static RotateSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        RotateSecretResponse self = new RotateSecretResponse();
        return TeaModel.build(map, self);
    }

    public RotateSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RotateSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RotateSecretResponse setBody(RotateSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public RotateSecretResponseBody getBody() {
        return this.body;
    }

}
