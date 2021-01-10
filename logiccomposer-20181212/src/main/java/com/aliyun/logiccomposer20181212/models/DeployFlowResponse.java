// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DeployFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployFlowResponseBody body;

    public static DeployFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployFlowResponse self = new DeployFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeployFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployFlowResponse setBody(DeployFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployFlowResponseBody getBody() {
        return this.body;
    }

}
