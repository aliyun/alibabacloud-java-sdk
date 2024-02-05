// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMeetingRoomGroupResponseBody body;

    public static UpdateMeetingRoomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomGroupResponse self = new UpdateMeetingRoomGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeetingRoomGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMeetingRoomGroupResponse setBody(UpdateMeetingRoomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeetingRoomGroupResponseBody getBody() {
        return this.body;
    }

}
