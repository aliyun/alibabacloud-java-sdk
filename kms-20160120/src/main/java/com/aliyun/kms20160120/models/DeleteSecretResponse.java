// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSecretResponseBody body;

    public static DeleteSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponse self = new DeleteSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretResponse setBody(DeleteSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretResponseBody getBody() {
        return this.body;
    }

}
