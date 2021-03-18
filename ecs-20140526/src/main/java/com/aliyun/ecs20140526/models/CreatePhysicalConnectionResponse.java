// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePhysicalConnectionResponseBody body;

    public static CreatePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionResponse self = new CreatePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhysicalConnectionResponse setBody(CreatePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
