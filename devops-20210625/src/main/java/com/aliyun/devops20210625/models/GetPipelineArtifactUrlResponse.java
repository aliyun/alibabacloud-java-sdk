// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineArtifactUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineArtifactUrlResponseBody body;

    public static GetPipelineArtifactUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineArtifactUrlResponse self = new GetPipelineArtifactUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineArtifactUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineArtifactUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineArtifactUrlResponse setBody(GetPipelineArtifactUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineArtifactUrlResponseBody getBody() {
        return this.body;
    }

}
