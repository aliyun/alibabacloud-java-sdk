// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMeetingRoomGroupResponseBody body;

    public static DeleteMeetingRoomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomGroupResponse self = new DeleteMeetingRoomGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMeetingRoomGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMeetingRoomGroupResponse setBody(DeleteMeetingRoomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMeetingRoomGroupResponseBody getBody() {
        return this.body;
    }

}
