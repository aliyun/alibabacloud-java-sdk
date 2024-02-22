// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteArtifactResponseBody body;

    public static DeleteArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactResponse self = new DeleteArtifactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteArtifactResponse setBody(DeleteArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteArtifactResponseBody getBody() {
        return this.body;
    }

}
