// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelCreateOrderResponseBody body;

    public static GlobalHotelCreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateOrderResponse self = new GlobalHotelCreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelCreateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelCreateOrderResponse setBody(GlobalHotelCreateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelCreateOrderResponseBody getBody() {
        return this.body;
    }

}
