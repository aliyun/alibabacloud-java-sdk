// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class FetchArtifactTempBucketTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ArtifactTempBucketToken body;

    public static FetchArtifactTempBucketTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchArtifactTempBucketTokenResponse self = new FetchArtifactTempBucketTokenResponse();
        return TeaModel.build(map, self);
    }

    public FetchArtifactTempBucketTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchArtifactTempBucketTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchArtifactTempBucketTokenResponse setBody(ArtifactTempBucketToken body) {
        this.body = body;
        return this;
    }
    public ArtifactTempBucketToken getBody() {
        return this.body;
    }

}
