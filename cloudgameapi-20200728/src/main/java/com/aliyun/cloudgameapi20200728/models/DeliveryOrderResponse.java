// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeliveryOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeliveryOrderResponseBody body;

    public static DeliveryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeliveryOrderResponse self = new DeliveryOrderResponse();
        return TeaModel.build(map, self);
    }

    public DeliveryOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeliveryOrderResponse setBody(DeliveryOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeliveryOrderResponseBody getBody() {
        return this.body;
    }

}
