// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientSecretResponseBody body;

    public static CreateClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientSecretResponse self = new CreateClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientSecretResponse setBody(CreateClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientSecretResponseBody getBody() {
        return this.body;
    }

}
