// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRegistryNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRegistryNamespaceResponseBody body;

    public static CreateRegistryNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryNamespaceResponse self = new CreateRegistryNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRegistryNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRegistryNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRegistryNamespaceResponse setBody(CreateRegistryNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRegistryNamespaceResponseBody getBody() {
        return this.body;
    }

}
