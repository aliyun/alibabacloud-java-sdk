// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppImageSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeContainerAppImageSecretResponseBody body;

    public static CreateEdgeContainerAppImageSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppImageSecretResponse self = new CreateEdgeContainerAppImageSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppImageSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeContainerAppImageSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeContainerAppImageSecretResponse setBody(CreateEdgeContainerAppImageSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeContainerAppImageSecretResponseBody getBody() {
        return this.body;
    }

}
