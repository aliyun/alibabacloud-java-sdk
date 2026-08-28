// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RunPluginPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunPluginPipelineResponseBody body;

    public static RunPluginPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPluginPipelineResponse self = new RunPluginPipelineResponse();
        return TeaModel.build(map, self);
    }

    public RunPluginPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPluginPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPluginPipelineResponse setBody(RunPluginPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPluginPipelineResponseBody getBody() {
        return this.body;
    }

}
