// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateMediaComplexTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMediaComplexTaskResponseBody body;

    public static CreateMediaComplexTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaComplexTaskResponse self = new CreateMediaComplexTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaComplexTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaComplexTaskResponse setBody(CreateMediaComplexTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaComplexTaskResponseBody getBody() {
        return this.body;
    }

}
