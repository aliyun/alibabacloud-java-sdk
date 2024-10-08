// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWaitingRoomEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWaitingRoomEventResponseBody body;

    public static DeleteWaitingRoomEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingRoomEventResponse self = new DeleteWaitingRoomEventResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingRoomEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaitingRoomEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWaitingRoomEventResponse setBody(DeleteWaitingRoomEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaitingRoomEventResponseBody getBody() {
        return this.body;
    }

}
