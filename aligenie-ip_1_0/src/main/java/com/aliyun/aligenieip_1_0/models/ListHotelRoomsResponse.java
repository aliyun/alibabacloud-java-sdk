// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelRoomsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelRoomsResponseBody body;

    public static ListHotelRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelRoomsResponse self = new ListHotelRoomsResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelRoomsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelRoomsResponse setBody(ListHotelRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelRoomsResponseBody getBody() {
        return this.body;
    }

}
