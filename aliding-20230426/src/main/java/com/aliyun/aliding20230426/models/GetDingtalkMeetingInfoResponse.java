// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDingtalkMeetingInfoResponseBody body;

    public static GetDingtalkMeetingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingInfoResponse self = new GetDingtalkMeetingInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingtalkMeetingInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingtalkMeetingInfoResponse setBody(GetDingtalkMeetingInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingtalkMeetingInfoResponseBody getBody() {
        return this.body;
    }

}
