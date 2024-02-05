// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMeetingRoomGroupResponseBody body;

    public static CreateMeetingRoomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomGroupResponse self = new CreateMeetingRoomGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMeetingRoomGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMeetingRoomGroupResponse setBody(CreateMeetingRoomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMeetingRoomGroupResponseBody getBody() {
        return this.body;
    }

}
