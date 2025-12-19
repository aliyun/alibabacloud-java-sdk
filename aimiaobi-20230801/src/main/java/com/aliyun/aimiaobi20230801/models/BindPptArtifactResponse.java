// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class BindPptArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindPptArtifactResponseBody body;

    public static BindPptArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPptArtifactResponse self = new BindPptArtifactResponse();
        return TeaModel.build(map, self);
    }

    public BindPptArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPptArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindPptArtifactResponse setBody(BindPptArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPptArtifactResponseBody getBody() {
        return this.body;
    }

}
