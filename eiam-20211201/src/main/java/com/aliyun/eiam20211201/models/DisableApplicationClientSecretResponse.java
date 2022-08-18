// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableApplicationClientSecretResponseBody body;

    public static DisableApplicationClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationClientSecretResponse self = new DisableApplicationClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationClientSecretResponse setBody(DisableApplicationClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

}
