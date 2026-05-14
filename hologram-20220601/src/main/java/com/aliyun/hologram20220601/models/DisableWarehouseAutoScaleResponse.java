// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableWarehouseAutoScaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableWarehouseAutoScaleResponseBody body;

    public static DisableWarehouseAutoScaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableWarehouseAutoScaleResponse self = new DisableWarehouseAutoScaleResponse();
        return TeaModel.build(map, self);
    }

    public DisableWarehouseAutoScaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableWarehouseAutoScaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableWarehouseAutoScaleResponse setBody(DisableWarehouseAutoScaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableWarehouseAutoScaleResponseBody getBody() {
        return this.body;
    }

}
