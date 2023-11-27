// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class DestroyRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DestroyRoomResponseBody body;

    public static DestroyRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyRoomResponse self = new DestroyRoomResponse();
        return TeaModel.build(map, self);
    }

    public DestroyRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyRoomResponse setBody(DestroyRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyRoomResponseBody getBody() {
        return this.body;
    }

}
