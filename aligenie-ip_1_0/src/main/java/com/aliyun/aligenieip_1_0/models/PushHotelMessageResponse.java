// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushHotelMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushHotelMessageResponseBody body;

    public static PushHotelMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PushHotelMessageResponse self = new PushHotelMessageResponse();
        return TeaModel.build(map, self);
    }

    public PushHotelMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushHotelMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushHotelMessageResponse setBody(PushHotelMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PushHotelMessageResponseBody getBody() {
        return this.body;
    }

}
