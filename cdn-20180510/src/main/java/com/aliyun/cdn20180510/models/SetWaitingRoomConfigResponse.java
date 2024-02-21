// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetWaitingRoomConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWaitingRoomConfigResponseBody body;

    public static SetWaitingRoomConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWaitingRoomConfigResponse self = new SetWaitingRoomConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetWaitingRoomConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWaitingRoomConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWaitingRoomConfigResponse setBody(SetWaitingRoomConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWaitingRoomConfigResponseBody getBody() {
        return this.body;
    }

}
