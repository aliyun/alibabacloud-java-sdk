// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinRoomResponseBody body;

    public static JoinRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinRoomResponse self = new JoinRoomResponse();
        return TeaModel.build(map, self);
    }

    public JoinRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinRoomResponse setBody(JoinRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinRoomResponseBody getBody() {
        return this.body;
    }

}
