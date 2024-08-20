// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class SuspendHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendHoloWarehouseResponseBody body;

    public static SuspendHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendHoloWarehouseResponse self = new SuspendHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public SuspendHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendHoloWarehouseResponse setBody(SuspendHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
