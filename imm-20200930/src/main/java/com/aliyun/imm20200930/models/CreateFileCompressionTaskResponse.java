// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileCompressionTaskResponseBody body;

    public static CreateFileCompressionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileCompressionTaskResponse self = new CreateFileCompressionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileCompressionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileCompressionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileCompressionTaskResponse setBody(CreateFileCompressionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileCompressionTaskResponseBody getBody() {
        return this.body;
    }

}
