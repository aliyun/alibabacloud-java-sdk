// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class TaskPreparingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TaskPreparingResponseBody body;

    public static TaskPreparingResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskPreparingResponse self = new TaskPreparingResponse();
        return TeaModel.build(map, self);
    }

    public TaskPreparingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskPreparingResponse setBody(TaskPreparingResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskPreparingResponseBody getBody() {
        return this.body;
    }

}
