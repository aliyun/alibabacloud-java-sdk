// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunPipelineResponseBody body;

    public static RunPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPipelineResponse self = new RunPipelineResponse();
        return TeaModel.build(map, self);
    }

    public RunPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPipelineResponse setBody(RunPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPipelineResponseBody getBody() {
        return this.body;
    }

}
