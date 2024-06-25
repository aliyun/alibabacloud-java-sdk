// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskCallListResponseBody body;

    public static TaskCallListResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskCallListResponse self = new TaskCallListResponse();
        return TeaModel.build(map, self);
    }

    public TaskCallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskCallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskCallListResponse setBody(TaskCallListResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskCallListResponseBody getBody() {
        return this.body;
    }

}
