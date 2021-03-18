// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVpcResponseBody body;

    public static CreateVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcResponse self = new CreateVpcResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcResponse setBody(CreateVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcResponseBody getBody() {
        return this.body;
    }

}
