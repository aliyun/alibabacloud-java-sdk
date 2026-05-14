// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableWarehouseAutoScaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableWarehouseAutoScaleResponseBody body;

    public static EnableWarehouseAutoScaleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWarehouseAutoScaleResponse self = new EnableWarehouseAutoScaleResponse();
        return TeaModel.build(map, self);
    }

    public EnableWarehouseAutoScaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWarehouseAutoScaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableWarehouseAutoScaleResponse setBody(EnableWarehouseAutoScaleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWarehouseAutoScaleResponseBody getBody() {
        return this.body;
    }

}
