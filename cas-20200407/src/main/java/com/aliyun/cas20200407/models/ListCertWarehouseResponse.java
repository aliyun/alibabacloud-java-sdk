// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCertWarehouseResponseBody body;

    public static ListCertWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCertWarehouseResponse self = new ListCertWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public ListCertWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCertWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCertWarehouseResponse setBody(ListCertWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCertWarehouseResponseBody getBody() {
        return this.body;
    }

}
