// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableFlowControlResponseBody body;

    public static EnableFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowControlResponse self = new EnableFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public EnableFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFlowControlResponse setBody(EnableFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFlowControlResponseBody getBody() {
        return this.body;
    }

}
