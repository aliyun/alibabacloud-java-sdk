// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class TaskConfigListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskConfigListResponseBody body;

    public static TaskConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskConfigListResponse self = new TaskConfigListResponse();
        return TeaModel.build(map, self);
    }

    public TaskConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskConfigListResponse setBody(TaskConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskConfigListResponseBody getBody() {
        return this.body;
    }

}
