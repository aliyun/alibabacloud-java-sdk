// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelValidatePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelValidatePriceResponseBody body;

    public static GlobalHotelValidatePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelValidatePriceResponse self = new GlobalHotelValidatePriceResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelValidatePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelValidatePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelValidatePriceResponse setBody(GlobalHotelValidatePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelValidatePriceResponseBody getBody() {
        return this.body;
    }

}
