// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelContactByNumberResponseBody body;

    public static GetHotelContactByNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByNumberResponse self = new GetHotelContactByNumberResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelContactByNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelContactByNumberResponse setBody(GetHotelContactByNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelContactByNumberResponseBody getBody() {
        return this.body;
    }

}
