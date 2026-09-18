// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateTargetScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTargetScanTaskResponseBody body;

    public static CreateTargetScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTargetScanTaskResponse self = new CreateTargetScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTargetScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTargetScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTargetScanTaskResponse setBody(CreateTargetScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTargetScanTaskResponseBody getBody() {
        return this.body;
    }

}
