// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelPricePullResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelPricePullResponseBody body;

    public static HotelPricePullResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelPricePullResponse self = new HotelPricePullResponse();
        return TeaModel.build(map, self);
    }

    public HotelPricePullResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelPricePullResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelPricePullResponse setBody(HotelPricePullResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelPricePullResponseBody getBody() {
        return this.body;
    }

}
