// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMeetingRoomResponseBody body;

    public static CreateMeetingRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomResponse self = new CreateMeetingRoomResponse();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMeetingRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMeetingRoomResponse setBody(CreateMeetingRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMeetingRoomResponseBody getBody() {
        return this.body;
    }

}
