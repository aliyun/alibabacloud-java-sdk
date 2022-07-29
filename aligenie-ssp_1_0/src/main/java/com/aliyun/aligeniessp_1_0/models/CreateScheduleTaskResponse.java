// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreateScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduleTaskResponseBody body;

    public static CreateScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleTaskResponse self = new CreateScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduleTaskResponse setBody(CreateScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
