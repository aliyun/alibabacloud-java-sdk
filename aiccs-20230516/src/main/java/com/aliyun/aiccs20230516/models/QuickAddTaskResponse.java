// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class QuickAddTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuickAddTaskResponseBody body;

    public static QuickAddTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QuickAddTaskResponse self = new QuickAddTaskResponse();
        return TeaModel.build(map, self);
    }

    public QuickAddTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuickAddTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuickAddTaskResponse setBody(QuickAddTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QuickAddTaskResponseBody getBody() {
        return this.body;
    }

}
