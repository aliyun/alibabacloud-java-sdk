// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetFlowDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowResult body;

    public static GetFlowDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowDraftResponse self = new GetFlowDraftResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowDraftResponse setBody(FlowResult body) {
        this.body = body;
        return this;
    }
    public FlowResult getBody() {
        return this.body;
    }

}
