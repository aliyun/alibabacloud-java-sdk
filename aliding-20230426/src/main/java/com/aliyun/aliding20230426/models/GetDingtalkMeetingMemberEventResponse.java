// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDingtalkMeetingMemberEventResponseBody body;

    public static GetDingtalkMeetingMemberEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberEventResponse self = new GetDingtalkMeetingMemberEventResponse();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingtalkMeetingMemberEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingtalkMeetingMemberEventResponse setBody(GetDingtalkMeetingMemberEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingtalkMeetingMemberEventResponseBody getBody() {
        return this.body;
    }

}
