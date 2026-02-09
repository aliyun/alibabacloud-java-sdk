// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPptArtifactResponseBody body;

    public static GetPptArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPptArtifactResponse self = new GetPptArtifactResponse();
        return TeaModel.build(map, self);
    }

    public GetPptArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPptArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPptArtifactResponse setBody(GetPptArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPptArtifactResponseBody getBody() {
        return this.body;
    }

}
