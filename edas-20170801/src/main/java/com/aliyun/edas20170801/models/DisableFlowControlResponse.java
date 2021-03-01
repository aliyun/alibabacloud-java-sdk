// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableFlowControlResponseBody body;

    public static DisableFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowControlResponse self = new DisableFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public DisableFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFlowControlResponse setBody(DisableFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFlowControlResponseBody getBody() {
        return this.body;
    }

}
