// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRestoreTaskResponseBody body;

    public static CreateRestoreTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreTaskResponse self = new CreateRestoreTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRestoreTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRestoreTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRestoreTaskResponse setBody(CreateRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
