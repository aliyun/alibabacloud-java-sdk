// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWarehouseResponseBody body;

    public static CreateWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseResponse self = new CreateWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWarehouseResponse setBody(CreateWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarehouseResponseBody getBody() {
        return this.body;
    }

}
