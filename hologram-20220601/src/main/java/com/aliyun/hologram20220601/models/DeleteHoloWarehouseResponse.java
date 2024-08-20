// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHoloWarehouseResponseBody body;

    public static DeleteHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoloWarehouseResponse self = new DeleteHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHoloWarehouseResponse setBody(DeleteHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
