// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBRestoreTaskResponseBody body;

    public static CreateDBRestoreTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBRestoreTaskResponse self = new CreateDBRestoreTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBRestoreTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBRestoreTaskResponse setBody(CreateDBRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
