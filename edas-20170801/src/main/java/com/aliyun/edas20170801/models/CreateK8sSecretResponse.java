// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateK8sSecretResponseBody body;

    public static CreateK8sSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sSecretResponse self = new CreateK8sSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateK8sSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateK8sSecretResponse setBody(CreateK8sSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateK8sSecretResponseBody getBody() {
        return this.body;
    }

}
