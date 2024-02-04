// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoModerationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoModerationTaskResponseBody body;

    public static CreateVideoModerationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoModerationTaskResponse self = new CreateVideoModerationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoModerationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoModerationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoModerationTaskResponse setBody(CreateVideoModerationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoModerationTaskResponseBody getBody() {
        return this.body;
    }

}
