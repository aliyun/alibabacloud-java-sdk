// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWaitingRoomEventResponseBody body;

    public static CreateWaitingRoomEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomEventResponse self = new CreateWaitingRoomEventResponse();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWaitingRoomEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWaitingRoomEventResponse setBody(CreateWaitingRoomEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWaitingRoomEventResponseBody getBody() {
        return this.body;
    }

}
