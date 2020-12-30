// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateRestoreTaskResponse setBody(CreateRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
