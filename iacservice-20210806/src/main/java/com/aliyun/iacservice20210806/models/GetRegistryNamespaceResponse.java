// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRegistryNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegistryNamespaceResponseBody body;

    public static GetRegistryNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryNamespaceResponse self = new GetRegistryNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetRegistryNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegistryNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegistryNamespaceResponse setBody(GetRegistryNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegistryNamespaceResponseBody getBody() {
        return this.body;
    }

}
