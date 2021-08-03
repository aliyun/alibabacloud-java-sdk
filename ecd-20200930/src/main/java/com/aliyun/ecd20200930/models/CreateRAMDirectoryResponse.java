// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRAMDirectoryResponseBody body;

    public static CreateRAMDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRAMDirectoryResponse self = new CreateRAMDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRAMDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRAMDirectoryResponse setBody(CreateRAMDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRAMDirectoryResponseBody getBody() {
        return this.body;
    }

}
