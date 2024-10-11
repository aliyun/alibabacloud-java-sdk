// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckDeleteVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDeleteVirtualWareHouseResponseBody body;

    public static CheckDeleteVirtualWareHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDeleteVirtualWareHouseResponse self = new CheckDeleteVirtualWareHouseResponse();
        return TeaModel.build(map, self);
    }

    public CheckDeleteVirtualWareHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDeleteVirtualWareHouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDeleteVirtualWareHouseResponse setBody(CheckDeleteVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDeleteVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
