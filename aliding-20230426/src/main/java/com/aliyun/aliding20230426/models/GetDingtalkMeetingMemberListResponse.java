// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDingtalkMeetingMemberListResponseBody body;

    public static GetDingtalkMeetingMemberListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberListResponse self = new GetDingtalkMeetingMemberListResponse();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingtalkMeetingMemberListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingtalkMeetingMemberListResponse setBody(GetDingtalkMeetingMemberListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingtalkMeetingMemberListResponseBody getBody() {
        return this.body;
    }

}
