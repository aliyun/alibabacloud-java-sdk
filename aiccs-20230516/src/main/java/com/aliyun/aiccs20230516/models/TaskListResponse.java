// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskListResponseBody body;

    public static TaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskListResponse self = new TaskListResponse();
        return TeaModel.build(map, self);
    }

    public TaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskListResponse setBody(TaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskListResponseBody getBody() {
        return this.body;
    }

}
