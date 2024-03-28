// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ResetServerSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetServerSecretResponseBody body;

    public static ResetServerSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetServerSecretResponse self = new ResetServerSecretResponse();
        return TeaModel.build(map, self);
    }

    public ResetServerSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetServerSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetServerSecretResponse setBody(ResetServerSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetServerSecretResponseBody getBody() {
        return this.body;
    }

}
