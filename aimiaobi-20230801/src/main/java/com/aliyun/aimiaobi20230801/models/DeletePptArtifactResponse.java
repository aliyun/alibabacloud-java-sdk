// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeletePptArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePptArtifactResponseBody body;

    public static DeletePptArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePptArtifactResponse self = new DeletePptArtifactResponse();
        return TeaModel.build(map, self);
    }

    public DeletePptArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePptArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePptArtifactResponse setBody(DeletePptArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePptArtifactResponseBody getBody() {
        return this.body;
    }

}
