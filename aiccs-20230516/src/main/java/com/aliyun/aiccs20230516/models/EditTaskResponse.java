// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class EditTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditTaskResponseBody body;

    public static EditTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        EditTaskResponse self = new EditTaskResponse();
        return TeaModel.build(map, self);
    }

    public EditTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditTaskResponse setBody(EditTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public EditTaskResponseBody getBody() {
        return this.body;
    }

}
