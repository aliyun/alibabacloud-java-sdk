// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public InvokeCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeCommandResponse setBody(InvokeCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeCommandResponseBody getBody() {
        return this.body;
    }

}
