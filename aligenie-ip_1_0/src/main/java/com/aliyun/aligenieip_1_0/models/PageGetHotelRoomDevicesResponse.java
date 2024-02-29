// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PageGetHotelRoomDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageGetHotelRoomDevicesResponseBody body;

    public static PageGetHotelRoomDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        PageGetHotelRoomDevicesResponse self = new PageGetHotelRoomDevicesResponse();
        return TeaModel.build(map, self);
    }

    public PageGetHotelRoomDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageGetHotelRoomDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageGetHotelRoomDevicesResponse setBody(PageGetHotelRoomDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public PageGetHotelRoomDevicesResponseBody getBody() {
        return this.body;
    }

}
