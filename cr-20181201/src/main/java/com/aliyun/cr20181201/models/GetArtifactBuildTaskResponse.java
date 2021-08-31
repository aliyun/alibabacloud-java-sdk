// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetArtifactBuildTaskResponseBody body;

    public static GetArtifactBuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildTaskResponse self = new GetArtifactBuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactBuildTaskResponse setBody(GetArtifactBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactBuildTaskResponseBody getBody() {
        return this.body;
    }

}
