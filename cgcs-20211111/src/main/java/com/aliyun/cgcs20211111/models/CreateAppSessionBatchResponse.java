// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppSessionBatchResponseBody body;

    public static CreateAppSessionBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchResponse self = new CreateAppSessionBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppSessionBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppSessionBatchResponse setBody(CreateAppSessionBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppSessionBatchResponseBody getBody() {
        return this.body;
    }

}
