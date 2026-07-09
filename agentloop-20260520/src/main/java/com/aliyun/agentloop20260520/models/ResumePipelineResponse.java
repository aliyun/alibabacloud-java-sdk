// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ResumePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumePipelineResponseBody body;

    public static ResumePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumePipelineResponse self = new ResumePipelineResponse();
        return TeaModel.build(map, self);
    }

    public ResumePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumePipelineResponse setBody(ResumePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumePipelineResponseBody getBody() {
        return this.body;
    }

}
