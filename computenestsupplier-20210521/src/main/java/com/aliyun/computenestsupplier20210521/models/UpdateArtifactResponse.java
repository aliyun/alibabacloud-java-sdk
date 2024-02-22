// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateArtifactResponseBody body;

    public static UpdateArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactResponse self = new UpdateArtifactResponse();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateArtifactResponse setBody(UpdateArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateArtifactResponseBody getBody() {
        return this.body;
    }

}
