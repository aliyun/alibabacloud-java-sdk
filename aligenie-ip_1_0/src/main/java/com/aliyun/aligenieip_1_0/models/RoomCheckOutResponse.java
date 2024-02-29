// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RoomCheckOutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RoomCheckOutResponseBody body;

    public static RoomCheckOutResponse build(java.util.Map<String, ?> map) throws Exception {
        RoomCheckOutResponse self = new RoomCheckOutResponse();
        return TeaModel.build(map, self);
    }

    public RoomCheckOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RoomCheckOutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RoomCheckOutResponse setBody(RoomCheckOutResponseBody body) {
        this.body = body;
        return this;
    }
    public RoomCheckOutResponseBody getBody() {
        return this.body;
    }

}
