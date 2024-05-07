// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAppSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppSecretResponseBody body;

    public static CreateAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSecretResponse self = new CreateAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppSecretResponse setBody(CreateAppSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppSecretResponseBody getBody() {
        return this.body;
    }

}
