// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class RestartVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartVirtualWareHouseResponseBody body;

    public static RestartVirtualWareHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartVirtualWareHouseResponse self = new RestartVirtualWareHouseResponse();
        return TeaModel.build(map, self);
    }

    public RestartVirtualWareHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartVirtualWareHouseResponse setBody(RestartVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
