// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RenameHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameHoloWarehouseResponseBody body;

    public static RenameHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameHoloWarehouseResponse self = new RenameHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public RenameHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameHoloWarehouseResponse setBody(RenameHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
