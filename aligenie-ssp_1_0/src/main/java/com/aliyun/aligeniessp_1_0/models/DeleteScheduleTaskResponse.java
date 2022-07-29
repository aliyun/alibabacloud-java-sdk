// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScheduleTaskResponseBody body;

    public static DeleteScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleTaskResponse self = new DeleteScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduleTaskResponse setBody(DeleteScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
