// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCreateVirtualWareHouseResponseBody body;

    public static CheckCreateVirtualWareHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateVirtualWareHouseResponse self = new CheckCreateVirtualWareHouseResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateVirtualWareHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreateVirtualWareHouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCreateVirtualWareHouseResponse setBody(CheckCreateVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
