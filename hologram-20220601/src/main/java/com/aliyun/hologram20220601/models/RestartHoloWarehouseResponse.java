// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RestartHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartHoloWarehouseResponseBody body;

    public static RestartHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartHoloWarehouseResponse self = new RestartHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public RestartHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartHoloWarehouseResponse setBody(RestartHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
