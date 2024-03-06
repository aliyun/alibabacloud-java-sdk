// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RestoreSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreSecretResponseBody body;

    public static RestoreSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreSecretResponse self = new RestoreSecretResponse();
        return TeaModel.build(map, self);
    }

    public RestoreSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreSecretResponse setBody(RestoreSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreSecretResponseBody getBody() {
        return this.body;
    }

}
