// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListArtifactVersionsResponseBody body;

    public static ListArtifactVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactVersionsResponse self = new ListArtifactVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactVersionsResponse setBody(ListArtifactVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactVersionsResponseBody getBody() {
        return this.body;
    }

}
