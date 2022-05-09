// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class CreateSynchronousJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSynchronousJobResponseBody body;

    public static CreateSynchronousJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSynchronousJobResponse self = new CreateSynchronousJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSynchronousJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSynchronousJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSynchronousJobResponse setBody(CreateSynchronousJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSynchronousJobResponseBody getBody() {
        return this.body;
    }

}
