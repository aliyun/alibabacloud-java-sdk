// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SuspendFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendFlowResponseBody body;

    public static SuspendFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendFlowResponse self = new SuspendFlowResponse();
        return TeaModel.build(map, self);
    }

    public SuspendFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendFlowResponse setBody(SuspendFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendFlowResponseBody getBody() {
        return this.body;
    }

}
