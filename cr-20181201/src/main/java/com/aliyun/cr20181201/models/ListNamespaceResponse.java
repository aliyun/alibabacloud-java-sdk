// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNamespaceResponseBody body;

    public static ListNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceResponse self = new ListNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNamespaceResponse setBody(ListNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamespaceResponseBody getBody() {
        return this.body;
    }

}
