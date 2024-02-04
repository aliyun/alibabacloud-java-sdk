// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageModerationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageModerationTaskResponseBody body;

    public static CreateImageModerationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageModerationTaskResponse self = new CreateImageModerationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageModerationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageModerationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageModerationTaskResponse setBody(CreateImageModerationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageModerationTaskResponseBody getBody() {
        return this.body;
    }

}
