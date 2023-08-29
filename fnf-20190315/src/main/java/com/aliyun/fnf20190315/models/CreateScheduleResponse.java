// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduleResponseBody body;

    public static CreateScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleResponse self = new CreateScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduleResponse setBody(CreateScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleResponseBody getBody() {
        return this.body;
    }

}
