// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class HotelQrBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelQrBindResponseBody body;

    public static HotelQrBindResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelQrBindResponse self = new HotelQrBindResponse();
        return TeaModel.build(map, self);
    }

    public HotelQrBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelQrBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelQrBindResponse setBody(HotelQrBindResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelQrBindResponseBody getBody() {
        return this.body;
    }

}
