// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScheduleConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScheduleConferenceResponseBody body;

    public static CreateScheduleConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleConferenceResponse self = new CreateScheduleConferenceResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduleConferenceResponse setBody(CreateScheduleConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleConferenceResponseBody getBody() {
        return this.body;
    }

}
