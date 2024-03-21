// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnKvNamespaceResponseBody body;

    public static DeleteDcdnKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnKvNamespaceResponse self = new DeleteDcdnKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnKvNamespaceResponse setBody(DeleteDcdnKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
