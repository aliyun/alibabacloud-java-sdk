// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDingtalkMeetingListResponseBody body;

    public static GetDingtalkMeetingListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingListResponse self = new GetDingtalkMeetingListResponse();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingtalkMeetingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingtalkMeetingListResponse setBody(GetDingtalkMeetingListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingtalkMeetingListResponseBody getBody() {
        return this.body;
    }

}
