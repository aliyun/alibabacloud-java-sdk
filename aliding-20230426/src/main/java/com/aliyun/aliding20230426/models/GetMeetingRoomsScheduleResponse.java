// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeetingRoomsScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMeetingRoomsScheduleResponseBody body;

    public static GetMeetingRoomsScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMeetingRoomsScheduleResponse self = new GetMeetingRoomsScheduleResponse();
        return TeaModel.build(map, self);
    }

    public GetMeetingRoomsScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMeetingRoomsScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMeetingRoomsScheduleResponse setBody(GetMeetingRoomsScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMeetingRoomsScheduleResponseBody getBody() {
        return this.body;
    }

}
