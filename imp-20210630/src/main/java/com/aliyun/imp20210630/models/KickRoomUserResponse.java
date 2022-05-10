// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class KickRoomUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public KickRoomUserResponseBody body;

    public static KickRoomUserResponse build(java.util.Map<String, ?> map) throws Exception {
        KickRoomUserResponse self = new KickRoomUserResponse();
        return TeaModel.build(map, self);
    }

    public KickRoomUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickRoomUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KickRoomUserResponse setBody(KickRoomUserResponseBody body) {
        this.body = body;
        return this;
    }
    public KickRoomUserResponseBody getBody() {
        return this.body;
    }

}
