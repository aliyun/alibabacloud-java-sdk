// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetFlowEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowEndpointResult body;

    public static GetFlowEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowEndpointResponse self = new GetFlowEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowEndpointResponse setBody(FlowEndpointResult body) {
        this.body = body;
        return this;
    }
    public FlowEndpointResult getBody() {
        return this.body;
    }

}
