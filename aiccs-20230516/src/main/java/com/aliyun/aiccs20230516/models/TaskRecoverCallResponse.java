// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskRecoverCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaskRecoverCallResponseBody body;

    public static TaskRecoverCallResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskRecoverCallResponse self = new TaskRecoverCallResponse();
        return TeaModel.build(map, self);
    }

    public TaskRecoverCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskRecoverCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskRecoverCallResponse setBody(TaskRecoverCallResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskRecoverCallResponseBody getBody() {
        return this.body;
    }

}
