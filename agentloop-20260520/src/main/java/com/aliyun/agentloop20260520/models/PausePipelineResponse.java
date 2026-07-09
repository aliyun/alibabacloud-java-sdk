// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PausePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PausePipelineResponseBody body;

    public static PausePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        PausePipelineResponse self = new PausePipelineResponse();
        return TeaModel.build(map, self);
    }

    public PausePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PausePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PausePipelineResponse setBody(PausePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public PausePipelineResponseBody getBody() {
        return this.body;
    }

}
