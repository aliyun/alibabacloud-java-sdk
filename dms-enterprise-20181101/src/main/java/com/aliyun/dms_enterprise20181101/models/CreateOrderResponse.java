// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrderResponseBody body;

    public static CreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponse self = new CreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderResponse setBody(CreateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderResponseBody getBody() {
        return this.body;
    }

}
