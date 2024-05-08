// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class LeaveRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LeaveRoomResponseBody body;

    public static LeaveRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        LeaveRoomResponse self = new LeaveRoomResponse();
        return TeaModel.build(map, self);
    }

    public LeaveRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LeaveRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LeaveRoomResponse setBody(LeaveRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public LeaveRoomResponseBody getBody() {
        return this.body;
    }

}
