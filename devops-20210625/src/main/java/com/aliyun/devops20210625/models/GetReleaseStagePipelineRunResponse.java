// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetReleaseStagePipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReleaseStagePipelineRunResponseBody body;

    public static GetReleaseStagePipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReleaseStagePipelineRunResponse self = new GetReleaseStagePipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public GetReleaseStagePipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReleaseStagePipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReleaseStagePipelineRunResponse setBody(GetReleaseStagePipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReleaseStagePipelineRunResponseBody getBody() {
        return this.body;
    }

}
