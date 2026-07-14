// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PreviewPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewPipelineResponseBody body;

    public static PreviewPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewPipelineResponse self = new PreviewPipelineResponse();
        return TeaModel.build(map, self);
    }

    public PreviewPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewPipelineResponse setBody(PreviewPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewPipelineResponseBody getBody() {
        return this.body;
    }

}
