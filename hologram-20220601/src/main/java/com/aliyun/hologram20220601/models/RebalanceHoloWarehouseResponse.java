// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RebalanceHoloWarehouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebalanceHoloWarehouseResponseBody body;

    public static RebalanceHoloWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        RebalanceHoloWarehouseResponse self = new RebalanceHoloWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public RebalanceHoloWarehouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebalanceHoloWarehouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebalanceHoloWarehouseResponse setBody(RebalanceHoloWarehouseResponseBody body) {
        this.body = body;
        return this;
    }
    public RebalanceHoloWarehouseResponseBody getBody() {
        return this.body;
    }

}
