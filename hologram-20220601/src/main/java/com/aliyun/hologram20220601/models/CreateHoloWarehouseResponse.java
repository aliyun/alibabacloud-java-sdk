// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHoloWarehouseResponseBody body;

    public static CreateHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHoloWarehouseResponse self = new CreateHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public CreateHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHoloWarehouseResponse setBody(CreateHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
