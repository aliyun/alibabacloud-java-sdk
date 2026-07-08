// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWarehouseResponseBody body;

    public static DeleteWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseResponse self = new DeleteWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWarehouseResponse setBody(DeleteWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWarehouseResponseBody getBody() {
        return this.body;
    }

}
