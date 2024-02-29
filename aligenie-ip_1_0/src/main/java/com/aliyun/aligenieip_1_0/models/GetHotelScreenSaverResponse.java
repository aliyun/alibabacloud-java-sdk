// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelScreenSaverResponseBody body;

    public static GetHotelScreenSaverResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverResponse self = new GetHotelScreenSaverResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelScreenSaverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelScreenSaverResponse setBody(GetHotelScreenSaverResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelScreenSaverResponseBody getBody() {
        return this.body;
    }

}
