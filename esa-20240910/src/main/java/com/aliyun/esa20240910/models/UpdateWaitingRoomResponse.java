// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWaitingRoomResponseBody body;

    public static UpdateWaitingRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomResponse self = new UpdateWaitingRoomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWaitingRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWaitingRoomResponse setBody(UpdateWaitingRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWaitingRoomResponseBody getBody() {
        return this.body;
    }

}
