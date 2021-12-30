// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineEmasArtifactUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetPipelineEmasArtifactUrlResponse setBody(GetPipelineEmasArtifactUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineEmasArtifactUrlResponseBody getBody() {
        return this.body;
    }

}
