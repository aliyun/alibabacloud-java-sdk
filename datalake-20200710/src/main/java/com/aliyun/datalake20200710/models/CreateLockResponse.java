// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLockResponse setBody(CreateLockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLockResponseBody getBody() {
        return this.body;
    }

}
