// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class KillFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KillFlowResponseBody body;

    public static KillFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        KillFlowResponse self = new KillFlowResponse();
        return TeaModel.build(map, self);
    }

    public KillFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillFlowResponse setBody(KillFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public KillFlowResponseBody getBody() {
        return this.body;
    }

}
