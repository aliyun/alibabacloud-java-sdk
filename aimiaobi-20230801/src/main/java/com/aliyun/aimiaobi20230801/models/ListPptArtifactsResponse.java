// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPptArtifactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPptArtifactsResponseBody body;

    public static ListPptArtifactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPptArtifactsResponse self = new ListPptArtifactsResponse();
        return TeaModel.build(map, self);
    }

    public ListPptArtifactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPptArtifactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPptArtifactsResponse setBody(ListPptArtifactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPptArtifactsResponseBody getBody() {
        return this.body;
    }

}
