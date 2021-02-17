// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateImageProcessTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageProcessTaskResponseBody body;

    public static CreateImageProcessTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageProcessTaskResponse self = new CreateImageProcessTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageProcessTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageProcessTaskResponse setBody(CreateImageProcessTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageProcessTaskResponseBody getBody() {
        return this.body;
    }

}
