// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleHoloWarehouseResponseBody body;

    public static ScaleHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleHoloWarehouseResponse self = new ScaleHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public ScaleHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleHoloWarehouseResponse setBody(ScaleHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
