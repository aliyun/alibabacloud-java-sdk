// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class RollBackFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollBackFlowResponseBody body;

    public static RollBackFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        RollBackFlowResponse self = new RollBackFlowResponse();
        return TeaModel.build(map, self);
    }

    public RollBackFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollBackFlowResponse setBody(RollBackFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public RollBackFlowResponseBody getBody() {
        return this.body;
    }

}
