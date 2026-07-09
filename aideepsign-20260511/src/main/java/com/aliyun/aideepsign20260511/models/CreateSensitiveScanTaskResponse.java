// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateSensitiveScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSensitiveScanTaskResponseBody body;

    public static CreateSensitiveScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSensitiveScanTaskResponse self = new CreateSensitiveScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSensitiveScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSensitiveScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSensitiveScanTaskResponse setBody(CreateSensitiveScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSensitiveScanTaskResponseBody getBody() {
        return this.body;
    }

}
