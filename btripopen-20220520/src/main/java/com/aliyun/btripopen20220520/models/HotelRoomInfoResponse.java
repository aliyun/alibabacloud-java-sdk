// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelRoomInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelRoomInfoResponseBody body;

    public static HotelRoomInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelRoomInfoResponse self = new HotelRoomInfoResponse();
        return TeaModel.build(map, self);
    }

    public HotelRoomInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelRoomInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelRoomInfoResponse setBody(HotelRoomInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelRoomInfoResponseBody getBody() {
        return this.body;
    }

}
