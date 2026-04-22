// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionArtifactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentSessionArtifactsResponseBody body;

    public static ListAgentSessionArtifactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionArtifactsResponse self = new ListAgentSessionArtifactsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionArtifactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSessionArtifactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentSessionArtifactsResponse setBody(ListAgentSessionArtifactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSessionArtifactsResponseBody getBody() {
        return this.body;
    }

}
