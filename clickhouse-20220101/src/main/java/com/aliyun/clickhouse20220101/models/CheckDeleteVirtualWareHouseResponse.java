// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckDeleteVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckDeleteVirtualWareHouseResponse setBody(CheckDeleteVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDeleteVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
