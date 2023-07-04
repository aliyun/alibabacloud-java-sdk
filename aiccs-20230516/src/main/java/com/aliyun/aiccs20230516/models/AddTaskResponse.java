// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTaskResponseBody body;

    public static AddTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTaskResponse self = new AddTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTaskResponse setBody(AddTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTaskResponseBody getBody() {
        return this.body;
    }

}
