// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCancelOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelCancelOrderResponseBody body;

    public static GlobalHotelCancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCancelOrderResponse self = new GlobalHotelCancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCancelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelCancelOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelCancelOrderResponse setBody(GlobalHotelCancelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelCancelOrderResponseBody getBody() {
        return this.body;
    }

}
