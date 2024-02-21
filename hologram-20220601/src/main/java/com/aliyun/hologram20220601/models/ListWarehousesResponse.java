// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehousesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWarehousesResponseBody body;

    public static ListWarehousesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarehousesResponse self = new ListWarehousesResponse();
        return TeaModel.build(map, self);
    }

    public ListWarehousesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarehousesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarehousesResponse setBody(ListWarehousesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarehousesResponseBody getBody() {
        return this.body;
    }

}
