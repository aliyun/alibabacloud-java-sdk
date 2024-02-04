// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileUncompressionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileUncompressionTaskResponseBody body;

    public static CreateFileUncompressionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUncompressionTaskResponse self = new CreateFileUncompressionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileUncompressionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileUncompressionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileUncompressionTaskResponse setBody(CreateFileUncompressionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileUncompressionTaskResponseBody getBody() {
        return this.body;
    }

}
