// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateRpcServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRpcServiceResponseBody body;

    public static CreateRpcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRpcServiceResponse self = new CreateRpcServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRpcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRpcServiceResponse setBody(CreateRpcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRpcServiceResponseBody getBody() {
        return this.body;
    }

}
