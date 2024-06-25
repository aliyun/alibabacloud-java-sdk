// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCancelCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskCancelCallResponseBody body;

    public static TaskCancelCallResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskCancelCallResponse self = new TaskCancelCallResponse();
        return TeaModel.build(map, self);
    }

    public TaskCancelCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskCancelCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskCancelCallResponse setBody(TaskCancelCallResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskCancelCallResponseBody getBody() {
        return this.body;
    }

}
