// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowEndpointResult body;

    public static UpdateFlowEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowEndpointResponse self = new UpdateFlowEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowEndpointResponse setBody(FlowEndpointResult body) {
        this.body = body;
        return this;
    }
    public FlowEndpointResult getBody() {
        return this.body;
    }

}
