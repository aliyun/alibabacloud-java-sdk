// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MeetingFlashMinutesResponseBody body;

    public static MeetingFlashMinutesResponse build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesResponse self = new MeetingFlashMinutesResponse();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MeetingFlashMinutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MeetingFlashMinutesResponse setBody(MeetingFlashMinutesResponseBody body) {
        this.body = body;
        return this;
    }
    public MeetingFlashMinutesResponseBody getBody() {
        return this.body;
    }

}
