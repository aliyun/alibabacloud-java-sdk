// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBatchResponseBody body;

    public static CreateBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchResponse self = new CreateBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchResponse setBody(CreateBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchResponseBody getBody() {
        return this.body;
    }

}
