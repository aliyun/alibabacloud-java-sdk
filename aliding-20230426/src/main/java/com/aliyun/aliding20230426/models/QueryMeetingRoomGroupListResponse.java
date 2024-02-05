// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMeetingRoomGroupListResponseBody body;

    public static QueryMeetingRoomGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupListResponse self = new QueryMeetingRoomGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMeetingRoomGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMeetingRoomGroupListResponse setBody(QueryMeetingRoomGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMeetingRoomGroupListResponseBody getBody() {
        return this.body;
    }

}
