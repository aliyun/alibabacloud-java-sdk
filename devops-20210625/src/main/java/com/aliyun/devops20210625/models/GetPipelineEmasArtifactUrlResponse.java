// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineEmasArtifactUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineEmasArtifactUrlResponseBody body;

    public static GetPipelineEmasArtifactUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineEmasArtifactUrlResponse self = new GetPipelineEmasArtifactUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineEmasArtifactUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineEmasArtifactUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineEmasArtifactUrlResponse setBody(GetPipelineEmasArtifactUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineEmasArtifactUrlResponseBody getBody() {
        return this.body;
    }

}
