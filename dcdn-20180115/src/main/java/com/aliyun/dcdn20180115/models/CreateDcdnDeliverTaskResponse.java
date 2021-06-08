// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDcdnDeliverTaskResponseBody body;

    public static CreateDcdnDeliverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDeliverTaskResponse self = new CreateDcdnDeliverTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDeliverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnDeliverTaskResponse setBody(CreateDcdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
