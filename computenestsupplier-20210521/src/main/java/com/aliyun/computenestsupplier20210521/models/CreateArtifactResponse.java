// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArtifactResponseBody body;

    public static CreateArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactResponse self = new CreateArtifactResponse();
        return TeaModel.build(map, self);
    }

    public CreateArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArtifactResponse setBody(CreateArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArtifactResponseBody getBody() {
        return this.body;
    }

}
