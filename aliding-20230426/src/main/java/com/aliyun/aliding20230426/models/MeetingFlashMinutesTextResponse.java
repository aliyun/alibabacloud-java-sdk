// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MeetingFlashMinutesTextResponseBody body;

    public static MeetingFlashMinutesTextResponse build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesTextResponse self = new MeetingFlashMinutesTextResponse();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MeetingFlashMinutesTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MeetingFlashMinutesTextResponse setBody(MeetingFlashMinutesTextResponseBody body) {
        this.body = body;
        return this;
    }
    public MeetingFlashMinutesTextResponseBody getBody() {
        return this.body;
    }

}
