// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRegistryNamespacesResponseBody body;

    public static ListRegistryNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryNamespacesResponse self = new ListRegistryNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListRegistryNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegistryNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegistryNamespacesResponse setBody(ListRegistryNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegistryNamespacesResponseBody getBody() {
        return this.body;
    }

}
