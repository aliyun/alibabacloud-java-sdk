// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskCallInfoResponseBody body;

    public static TaskCallInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskCallInfoResponse self = new TaskCallInfoResponse();
        return TeaModel.build(map, self);
    }

    public TaskCallInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskCallInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskCallInfoResponse setBody(TaskCallInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskCallInfoResponseBody getBody() {
        return this.body;
    }

}
