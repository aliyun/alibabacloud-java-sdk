// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteK8sSecretResponseBody body;

    public static DeleteK8sSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sSecretResponse self = new DeleteK8sSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteK8sSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteK8sSecretResponse setBody(DeleteK8sSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sSecretResponseBody getBody() {
        return this.body;
    }

}
