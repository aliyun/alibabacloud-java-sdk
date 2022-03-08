// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWorkOrderResponseBody body;

    public static CreateWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkOrderResponse self = new CreateWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkOrderResponse setBody(CreateWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkOrderResponseBody getBody() {
        return this.body;
    }

}
