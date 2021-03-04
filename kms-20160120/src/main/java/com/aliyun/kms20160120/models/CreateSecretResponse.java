// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSecretResponseBody body;

    public static CreateSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretResponse self = new CreateSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecretResponse setBody(CreateSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecretResponseBody getBody() {
        return this.body;
    }

}
