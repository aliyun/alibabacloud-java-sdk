// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateFinReportSummaryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFinReportSummaryTaskResponseBody body;

    public static CreateFinReportSummaryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFinReportSummaryTaskResponse self = new CreateFinReportSummaryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFinReportSummaryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFinReportSummaryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFinReportSummaryTaskResponse setBody(CreateFinReportSummaryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFinReportSummaryTaskResponseBody getBody() {
        return this.body;
    }

}
