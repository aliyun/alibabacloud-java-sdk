// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetArtifactBuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactBuildTaskResponse setBody(GetArtifactBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactBuildTaskResponseBody getBody() {
        return this.body;
    }

}
