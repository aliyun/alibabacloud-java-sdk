// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Artifact body;

    public static PutArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        PutArtifactResponse self = new PutArtifactResponse();
        return TeaModel.build(map, self);
    }

    public PutArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutArtifactResponse setBody(Artifact body) {
        this.body = body;
        return this;
    }
    public Artifact getBody() {
        return this.body;
    }

}
