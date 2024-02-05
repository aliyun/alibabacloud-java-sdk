// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CancelScheduleConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelScheduleConferenceResponseBody body;

    public static CancelScheduleConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelScheduleConferenceResponse self = new CancelScheduleConferenceResponse();
        return TeaModel.build(map, self);
    }

    public CancelScheduleConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelScheduleConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelScheduleConferenceResponse setBody(CancelScheduleConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelScheduleConferenceResponseBody getBody() {
        return this.body;
    }

}
