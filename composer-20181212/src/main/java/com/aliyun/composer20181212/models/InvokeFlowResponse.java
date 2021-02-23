// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class InvokeFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeFlowResponseBody body;

    public static InvokeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeFlowResponse self = new InvokeFlowResponse();
        return TeaModel.build(map, self);
    }

    public InvokeFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeFlowResponse setBody(InvokeFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeFlowResponseBody getBody() {
        return this.body;
    }

}
