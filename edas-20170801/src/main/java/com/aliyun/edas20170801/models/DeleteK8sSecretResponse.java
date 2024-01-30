// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteK8sSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteK8sSecretResponse setBody(DeleteK8sSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sSecretResponseBody getBody() {
        return this.body;
    }

}
