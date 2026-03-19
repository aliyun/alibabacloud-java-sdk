// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportPptArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportPptArtifactResponseBody body;

    public static ExportPptArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportPptArtifactResponse self = new ExportPptArtifactResponse();
        return TeaModel.build(map, self);
    }

    public ExportPptArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportPptArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportPptArtifactResponse setBody(ExportPptArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportPptArtifactResponseBody getBody() {
        return this.body;
    }

}
