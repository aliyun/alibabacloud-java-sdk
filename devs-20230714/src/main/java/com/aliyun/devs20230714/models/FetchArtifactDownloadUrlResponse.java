// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class FetchArtifactDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ArtifactCode body;

    public static FetchArtifactDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchArtifactDownloadUrlResponse self = new FetchArtifactDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public FetchArtifactDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchArtifactDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchArtifactDownloadUrlResponse setBody(ArtifactCode body) {
        this.body = body;
        return this;
    }
    public ArtifactCode getBody() {
        return this.body;
    }

}
