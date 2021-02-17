// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoProduceTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoProduceTaskResponseBody body;

    public static CreateVideoProduceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoProduceTaskResponse self = new CreateVideoProduceTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoProduceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoProduceTaskResponse setBody(CreateVideoProduceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoProduceTaskResponseBody getBody() {
        return this.body;
    }

}
