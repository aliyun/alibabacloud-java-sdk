// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ChangeAlarmSeverityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAlarmSeverityResponseBody body;

    public static ChangeAlarmSeverityResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAlarmSeverityResponse self = new ChangeAlarmSeverityResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAlarmSeverityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAlarmSeverityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAlarmSeverityResponse setBody(ChangeAlarmSeverityResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAlarmSeverityResponseBody getBody() {
        return this.body;
    }

}
