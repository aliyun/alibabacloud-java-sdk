// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ExecutePipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecutePipelineResponseBody body;

    public static ExecutePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecutePipelineResponse self = new ExecutePipelineResponse();
        return TeaModel.build(map, self);
    }

    public ExecutePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecutePipelineResponse setBody(ExecutePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecutePipelineResponseBody getBody() {
        return this.body;
    }

}
