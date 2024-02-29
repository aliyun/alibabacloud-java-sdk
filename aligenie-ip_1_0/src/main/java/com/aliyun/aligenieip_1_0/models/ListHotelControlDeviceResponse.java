// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelControlDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelControlDeviceResponseBody body;

    public static ListHotelControlDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelControlDeviceResponse self = new ListHotelControlDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelControlDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelControlDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelControlDeviceResponse setBody(ListHotelControlDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelControlDeviceResponseBody getBody() {
        return this.body;
    }

}
