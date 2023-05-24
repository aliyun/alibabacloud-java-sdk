// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelAskingPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelAskingPriceResponseBody body;

    public static HotelAskingPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelAskingPriceResponse self = new HotelAskingPriceResponse();
        return TeaModel.build(map, self);
    }

    public HotelAskingPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelAskingPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelAskingPriceResponse setBody(HotelAskingPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelAskingPriceResponseBody getBody() {
        return this.body;
    }

}
