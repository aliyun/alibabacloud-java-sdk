// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DisableFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableFlowResponseBody body;

    public static DisableFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowResponse self = new DisableFlowResponse();
        return TeaModel.build(map, self);
    }

    public DisableFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFlowResponse setBody(DisableFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFlowResponseBody getBody() {
        return this.body;
    }

}
