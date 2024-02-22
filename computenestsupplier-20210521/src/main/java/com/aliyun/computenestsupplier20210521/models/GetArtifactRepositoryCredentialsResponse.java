// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactRepositoryCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArtifactRepositoryCredentialsResponseBody body;

    public static GetArtifactRepositoryCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactRepositoryCredentialsResponse self = new GetArtifactRepositoryCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactRepositoryCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactRepositoryCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactRepositoryCredentialsResponse setBody(GetArtifactRepositoryCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactRepositoryCredentialsResponseBody getBody() {
        return this.body;
    }

}
