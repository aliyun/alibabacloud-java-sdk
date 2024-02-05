// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMeetingRoomResponseBody body;

    public static QueryMeetingRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomResponse self = new QueryMeetingRoomResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMeetingRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMeetingRoomResponse setBody(QueryMeetingRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMeetingRoomResponseBody getBody() {
        return this.body;
    }

}
