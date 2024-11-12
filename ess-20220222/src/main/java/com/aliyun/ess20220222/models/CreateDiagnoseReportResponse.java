// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateDiagnoseReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiagnoseReportResponseBody body;

    public static CreateDiagnoseReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnoseReportResponse self = new CreateDiagnoseReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnoseReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnoseReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiagnoseReportResponse setBody(CreateDiagnoseReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnoseReportResponseBody getBody() {
        return this.body;
    }

}
