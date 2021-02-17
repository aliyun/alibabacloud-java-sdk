// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoCompressTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoCompressTaskResponseBody body;

    public static CreateVideoCompressTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoCompressTaskResponse self = new CreateVideoCompressTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoCompressTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoCompressTaskResponse setBody(CreateVideoCompressTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoCompressTaskResponseBody getBody() {
        return this.body;
    }

}
