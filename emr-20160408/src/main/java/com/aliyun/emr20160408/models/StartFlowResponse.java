// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class StartFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartFlowResponseBody body;

    public static StartFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartFlowResponse self = new StartFlowResponse();
        return TeaModel.build(map, self);
    }

    public StartFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartFlowResponse setBody(StartFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public StartFlowResponseBody getBody() {
        return this.body;
    }

}
