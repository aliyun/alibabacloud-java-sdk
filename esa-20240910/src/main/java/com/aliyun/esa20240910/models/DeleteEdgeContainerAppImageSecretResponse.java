// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppImageSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeContainerAppImageSecretResponseBody body;

    public static DeleteEdgeContainerAppImageSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppImageSecretResponse self = new DeleteEdgeContainerAppImageSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppImageSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeContainerAppImageSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeContainerAppImageSecretResponse setBody(DeleteEdgeContainerAppImageSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeContainerAppImageSecretResponseBody getBody() {
        return this.body;
    }

}
