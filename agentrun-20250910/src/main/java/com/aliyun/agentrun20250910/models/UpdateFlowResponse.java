// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowResult body;

    public static UpdateFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowResponse self = new UpdateFlowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowResponse setBody(FlowResult body) {
        this.body = body;
        return this;
    }
    public FlowResult getBody() {
        return this.body;
    }

}
