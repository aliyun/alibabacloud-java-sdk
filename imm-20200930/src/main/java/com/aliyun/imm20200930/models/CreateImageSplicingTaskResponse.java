// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageSplicingTaskResponseBody body;

    public static CreateImageSplicingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskResponse self = new CreateImageSplicingTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageSplicingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageSplicingTaskResponse setBody(CreateImageSplicingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageSplicingTaskResponseBody getBody() {
        return this.body;
    }

}
