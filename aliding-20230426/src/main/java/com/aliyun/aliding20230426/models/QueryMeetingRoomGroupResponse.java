// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMeetingRoomGroupResponseBody body;

    public static QueryMeetingRoomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupResponse self = new QueryMeetingRoomGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMeetingRoomGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMeetingRoomGroupResponse setBody(QueryMeetingRoomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMeetingRoomGroupResponseBody getBody() {
        return this.body;
    }

}
