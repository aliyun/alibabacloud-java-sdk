// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class AbolishFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbolishFlowResponseBody body;

    public static AbolishFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishFlowResponse self = new AbolishFlowResponse();
        return TeaModel.build(map, self);
    }

    public AbolishFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishFlowResponse setBody(AbolishFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishFlowResponseBody getBody() {
        return this.body;
    }

}
