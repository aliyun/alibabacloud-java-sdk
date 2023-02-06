// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetArtifactResponseBody body;

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

    public GetArtifactResponse setBody(GetArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactResponseBody getBody() {
        return this.body;
    }

}
