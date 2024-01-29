// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScheduledTaskResponseBody body;

    public static DeleteScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledTaskResponse self = new DeleteScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduledTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduledTaskResponse setBody(DeleteScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
