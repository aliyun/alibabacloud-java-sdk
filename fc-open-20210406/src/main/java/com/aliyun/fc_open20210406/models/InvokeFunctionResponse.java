// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class InvokeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public byte[] body;

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

    public InvokeFunctionResponse setBody(byte[] body) {
        this.body = body;
        return this;
    }
    public byte[] getBody() {
        return this.body;
    }

}
