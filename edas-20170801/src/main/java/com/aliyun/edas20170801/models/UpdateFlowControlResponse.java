// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlowControlResponseBody body;

    public static UpdateFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowControlResponse self = new UpdateFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowControlResponse setBody(UpdateFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowControlResponseBody getBody() {
        return this.body;
    }

}
