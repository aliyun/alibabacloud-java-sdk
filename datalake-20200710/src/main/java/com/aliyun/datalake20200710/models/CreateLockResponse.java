// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLockResponseBody body;

    public static CreateLockResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLockResponse self = new CreateLockResponse();
        return TeaModel.build(map, self);
    }

    public CreateLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLockResponse setBody(CreateLockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLockResponseBody getBody() {
        return this.body;
    }

}
