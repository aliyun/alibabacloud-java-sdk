// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListArtifactsResponseBody body;

    public static ListArtifactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsResponse self = new ListArtifactsResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactsResponse setBody(ListArtifactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactsResponseBody getBody() {
        return this.body;
    }

}
