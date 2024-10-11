// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKvNamespaceResponseBody body;

    public static DeleteKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKvNamespaceResponse self = new DeleteKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKvNamespaceResponse setBody(DeleteKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
