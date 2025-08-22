// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRegistryNamespaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRegistryNamespaceAttributeResponseBody body;

    public static UpdateRegistryNamespaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryNamespaceAttributeResponse self = new UpdateRegistryNamespaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryNamespaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRegistryNamespaceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRegistryNamespaceAttributeResponse setBody(UpdateRegistryNamespaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRegistryNamespaceAttributeResponseBody getBody() {
        return this.body;
    }

}
