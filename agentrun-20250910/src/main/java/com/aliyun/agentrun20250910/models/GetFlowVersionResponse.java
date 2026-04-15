// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowVersionResult body;

    public static GetFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowVersionResponse self = new GetFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowVersionResponse setBody(FlowVersionResult body) {
        this.body = body;
        return this;
    }
    public FlowVersionResult getBody() {
        return this.body;
    }

}
