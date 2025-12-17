// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteDiagnoseReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDiagnoseReportResponseBody body;

    public static DeleteDiagnoseReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnoseReportResponse self = new DeleteDiagnoseReportResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnoseReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiagnoseReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDiagnoseReportResponse setBody(DeleteDiagnoseReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiagnoseReportResponseBody getBody() {
        return this.body;
    }

}
