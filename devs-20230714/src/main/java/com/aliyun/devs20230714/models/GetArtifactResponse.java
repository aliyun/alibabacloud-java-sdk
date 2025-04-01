// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Artifact body;

    public static GetArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactResponse self = new GetArtifactResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactResponse setBody(Artifact body) {
        this.body = body;
        return this;
    }
    public Artifact getBody() {
        return this.body;
    }

}
