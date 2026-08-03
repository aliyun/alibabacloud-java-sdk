// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelQueryOrderResponseBody body;

    public static GlobalHotelQueryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryOrderResponse self = new GlobalHotelQueryOrderResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelQueryOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelQueryOrderResponse setBody(GlobalHotelQueryOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelQueryOrderResponseBody getBody() {
        return this.body;
    }

}
