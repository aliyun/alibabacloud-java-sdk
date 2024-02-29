// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByGenieDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelContactByGenieDeviceResponseBody body;

    public static GetHotelContactByGenieDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByGenieDeviceResponse self = new GetHotelContactByGenieDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByGenieDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelContactByGenieDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelContactByGenieDeviceResponse setBody(GetHotelContactByGenieDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelContactByGenieDeviceResponseBody getBody() {
        return this.body;
    }

}
