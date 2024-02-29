// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverStyleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelScreenSaverStyleResponseBody body;

    public static GetHotelScreenSaverStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverStyleResponse self = new GetHotelScreenSaverStyleResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelScreenSaverStyleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelScreenSaverStyleResponse setBody(GetHotelScreenSaverStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelScreenSaverStyleResponseBody getBody() {
        return this.body;
    }

}
