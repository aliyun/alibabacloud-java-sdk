// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScheduleConferenceResponseBody body;

    public static UpdateScheduleConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConferenceResponse self = new UpdateScheduleConferenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduleConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScheduleConferenceResponse setBody(UpdateScheduleConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduleConferenceResponseBody getBody() {
        return this.body;
    }

}
