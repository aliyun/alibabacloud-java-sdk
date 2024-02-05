// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMeetingRoomResponseBody body;

    public static UpdateMeetingRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomResponse self = new UpdateMeetingRoomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeetingRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMeetingRoomResponse setBody(UpdateMeetingRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeetingRoomResponseBody getBody() {
        return this.body;
    }

}
