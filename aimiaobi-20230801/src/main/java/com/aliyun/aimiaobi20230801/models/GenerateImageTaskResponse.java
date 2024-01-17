// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateImageTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateImageTaskResponseBody body;

    public static GenerateImageTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageTaskResponse self = new GenerateImageTaskResponse();
        return TeaModel.build(map, self);
    }

    public GenerateImageTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateImageTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateImageTaskResponse setBody(GenerateImageTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateImageTaskResponseBody getBody() {
        return this.body;
    }

}
