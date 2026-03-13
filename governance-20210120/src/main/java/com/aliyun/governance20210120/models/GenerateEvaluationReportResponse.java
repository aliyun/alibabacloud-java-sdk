// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GenerateEvaluationReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateEvaluationReportResponseBody body;

    public static GenerateEvaluationReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateEvaluationReportResponse self = new GenerateEvaluationReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateEvaluationReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateEvaluationReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateEvaluationReportResponse setBody(GenerateEvaluationReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateEvaluationReportResponseBody getBody() {
        return this.body;
    }

}
