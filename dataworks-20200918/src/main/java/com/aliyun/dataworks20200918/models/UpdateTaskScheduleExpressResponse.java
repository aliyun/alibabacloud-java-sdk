// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateTaskScheduleExpressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskScheduleExpressResponseBody body;

    public static UpdateTaskScheduleExpressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskScheduleExpressResponse self = new UpdateTaskScheduleExpressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskScheduleExpressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskScheduleExpressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskScheduleExpressResponse setBody(UpdateTaskScheduleExpressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskScheduleExpressResponseBody getBody() {
        return this.body;
    }

}
