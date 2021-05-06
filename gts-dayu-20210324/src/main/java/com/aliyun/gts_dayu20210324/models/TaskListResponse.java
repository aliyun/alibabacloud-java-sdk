// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class TaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public TaskListResponse setBody(TaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskListResponseBody getBody() {
        return this.body;
    }

}
