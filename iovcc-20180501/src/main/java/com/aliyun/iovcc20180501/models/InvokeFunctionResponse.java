// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class InvokeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeFunctionResponseBody body;

    public static InvokeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeFunctionResponse self = new InvokeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public InvokeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeFunctionResponse setBody(InvokeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeFunctionResponseBody getBody() {
        return this.body;
    }

}
