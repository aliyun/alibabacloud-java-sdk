// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CancelPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelPipelineRunResponseBody body;

    public static CancelPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPipelineRunResponse self = new CancelPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public CancelPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelPipelineRunResponse setBody(CancelPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPipelineRunResponseBody getBody() {
        return this.body;
    }

}
