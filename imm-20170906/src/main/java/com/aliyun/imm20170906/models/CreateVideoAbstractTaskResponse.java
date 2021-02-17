// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoAbstractTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoAbstractTaskResponseBody body;

    public static CreateVideoAbstractTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoAbstractTaskResponse self = new CreateVideoAbstractTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoAbstractTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoAbstractTaskResponse setBody(CreateVideoAbstractTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoAbstractTaskResponseBody getBody() {
        return this.body;
    }

}
