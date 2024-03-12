// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationClientSecretResponseBody body;

    public static CreateApplicationClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationClientSecretResponse self = new CreateApplicationClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationClientSecretResponse setBody(CreateApplicationClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

}
