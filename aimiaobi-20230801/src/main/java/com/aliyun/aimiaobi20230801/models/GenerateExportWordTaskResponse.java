// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateExportWordTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateExportWordTaskResponseBody body;

    public static GenerateExportWordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateExportWordTaskResponse self = new GenerateExportWordTaskResponse();
        return TeaModel.build(map, self);
    }

    public GenerateExportWordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateExportWordTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateExportWordTaskResponse setBody(GenerateExportWordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateExportWordTaskResponseBody getBody() {
        return this.body;
    }

}
