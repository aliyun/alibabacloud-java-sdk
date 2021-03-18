// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeCommandResponseBody body;

    public static InvokeCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandResponse self = new InvokeCommandResponse();
        return TeaModel.build(map, self);
    }

    public InvokeCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeCommandResponse setBody(InvokeCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeCommandResponseBody getBody() {
        return this.body;
    }

}
