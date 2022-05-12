// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StartPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartPipelineRunResponseBody body;

    public static StartPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineRunResponse self = new StartPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public StartPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPipelineRunResponse setBody(StartPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPipelineRunResponseBody getBody() {
        return this.body;
    }

}
