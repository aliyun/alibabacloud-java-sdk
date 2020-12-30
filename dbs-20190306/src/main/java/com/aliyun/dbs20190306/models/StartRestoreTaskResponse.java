// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StartRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartRestoreTaskResponseBody body;

    public static StartRestoreTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRestoreTaskResponse self = new StartRestoreTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartRestoreTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRestoreTaskResponse setBody(StartRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
