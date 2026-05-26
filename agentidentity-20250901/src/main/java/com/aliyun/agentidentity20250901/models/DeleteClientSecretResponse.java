// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientSecretResponseBody body;

    public static DeleteClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientSecretResponse self = new DeleteClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientSecretResponse setBody(DeleteClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientSecretResponseBody getBody() {
        return this.body;
    }

}
