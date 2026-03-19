// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptArtifactExportResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPptArtifactExportResultResponseBody body;

    public static GetPptArtifactExportResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPptArtifactExportResultResponse self = new GetPptArtifactExportResultResponse();
        return TeaModel.build(map, self);
    }

    public GetPptArtifactExportResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPptArtifactExportResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPptArtifactExportResultResponse setBody(GetPptArtifactExportResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPptArtifactExportResultResponseBody getBody() {
        return this.body;
    }

}
