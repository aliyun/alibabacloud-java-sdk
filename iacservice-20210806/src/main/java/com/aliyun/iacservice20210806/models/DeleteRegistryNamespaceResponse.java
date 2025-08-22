// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRegistryNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRegistryNamespaceResponseBody body;

    public static DeleteRegistryNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryNamespaceResponse self = new DeleteRegistryNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistryNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRegistryNamespaceResponse setBody(DeleteRegistryNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistryNamespaceResponseBody getBody() {
        return this.body;
    }

}
