// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWarehouseResponseBody body;

    public static ListWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseResponse self = new ListWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public ListWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarehouseResponse setBody(ListWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarehouseResponseBody getBody() {
        return this.body;
    }

}
