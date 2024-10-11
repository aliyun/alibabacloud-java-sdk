// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateDataDiagnoseTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataDiagnoseTaskResponseBody body;

    public static CreateDataDiagnoseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnoseTaskResponse self = new CreateDataDiagnoseTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnoseTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataDiagnoseTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataDiagnoseTaskResponse setBody(CreateDataDiagnoseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataDiagnoseTaskResponseBody getBody() {
        return this.body;
    }

}
