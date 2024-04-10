// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelArtifactBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelArtifactBuildTaskResponseBody body;

    public static CancelArtifactBuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelArtifactBuildTaskResponse self = new CancelArtifactBuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelArtifactBuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelArtifactBuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelArtifactBuildTaskResponse setBody(CancelArtifactBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelArtifactBuildTaskResponseBody getBody() {
        return this.body;
    }

}
