// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallChatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskCallChatsResponseBody body;

    public static TaskCallChatsResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskCallChatsResponse self = new TaskCallChatsResponse();
        return TeaModel.build(map, self);
    }

    public TaskCallChatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskCallChatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskCallChatsResponse setBody(TaskCallChatsResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskCallChatsResponseBody getBody() {
        return this.body;
    }

}
