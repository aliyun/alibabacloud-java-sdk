// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPADiagnosisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPADiagnosisTaskResponseBody body;

    public static GetPADiagnosisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPADiagnosisTaskResponse self = new GetPADiagnosisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetPADiagnosisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPADiagnosisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPADiagnosisTaskResponse setBody(GetPADiagnosisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPADiagnosisTaskResponseBody getBody() {
        return this.body;
    }

}
