// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMeetingRoomListResponseBody body;

    public static QueryMeetingRoomListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomListResponse self = new QueryMeetingRoomListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMeetingRoomListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMeetingRoomListResponse setBody(QueryMeetingRoomListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMeetingRoomListResponseBody getBody() {
        return this.body;
    }

}
