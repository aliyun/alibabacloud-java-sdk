// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelRoomDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelRoomDeviceResponseBody body;

    public static GetHotelRoomDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelRoomDeviceResponse self = new GetHotelRoomDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelRoomDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelRoomDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelRoomDeviceResponse setBody(GetHotelRoomDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelRoomDeviceResponseBody getBody() {
        return this.body;
    }

}
