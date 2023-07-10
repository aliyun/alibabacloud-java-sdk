// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNamespacesResponseBody body;

    public static ListNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponse self = new ListNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNamespacesResponse setBody(ListNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamespacesResponseBody getBody() {
        return this.body;
    }

}
