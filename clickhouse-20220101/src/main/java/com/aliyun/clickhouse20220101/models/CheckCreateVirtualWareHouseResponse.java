// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckCreateVirtualWareHouseResponse setBody(CheckCreateVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
