// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitFlowResponseBody body;

    public static SubmitFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowResponse self = new SubmitFlowResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFlowResponse setBody(SubmitFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFlowResponseBody getBody() {
        return this.body;
    }

}
