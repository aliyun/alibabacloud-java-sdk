// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWaitingRoomResponseBody body;

    public static CreateWaitingRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomResponse self = new CreateWaitingRoomResponse();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWaitingRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWaitingRoomResponse setBody(CreateWaitingRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWaitingRoomResponseBody getBody() {
        return this.body;
    }

}
