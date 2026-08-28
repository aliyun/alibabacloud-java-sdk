// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateRollbackTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRollbackTaskResponseBody body;

    public static CreateRollbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRollbackTaskResponse self = new CreateRollbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRollbackTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRollbackTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRollbackTaskResponse setBody(CreateRollbackTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRollbackTaskResponseBody getBody() {
        return this.body;
    }

}
