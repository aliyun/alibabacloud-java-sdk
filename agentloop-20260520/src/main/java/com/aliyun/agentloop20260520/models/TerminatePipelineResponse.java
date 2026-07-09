// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class TerminatePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminatePipelineResponseBody body;

    public static TerminatePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminatePipelineResponse self = new TerminatePipelineResponse();
        return TeaModel.build(map, self);
    }

    public TerminatePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminatePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminatePipelineResponse setBody(TerminatePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminatePipelineResponseBody getBody() {
        return this.body;
    }

}
