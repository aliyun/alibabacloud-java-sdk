// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ReleaseArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseArtifactResponseBody body;

    public static ReleaseArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseArtifactResponse self = new ReleaseArtifactResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseArtifactResponse setBody(ReleaseArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseArtifactResponseBody getBody() {
        return this.body;
    }

}
