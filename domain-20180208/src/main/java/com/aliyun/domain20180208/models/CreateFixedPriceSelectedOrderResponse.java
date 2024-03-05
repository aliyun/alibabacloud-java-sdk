// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateFixedPriceSelectedOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFixedPriceSelectedOrderResponseBody body;

    public static CreateFixedPriceSelectedOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedPriceSelectedOrderResponse self = new CreateFixedPriceSelectedOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFixedPriceSelectedOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFixedPriceSelectedOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFixedPriceSelectedOrderResponse setBody(CreateFixedPriceSelectedOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFixedPriceSelectedOrderResponseBody getBody() {
        return this.body;
    }

}
