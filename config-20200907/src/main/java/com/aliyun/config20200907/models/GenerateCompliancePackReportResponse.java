// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateCompliancePackReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCompliancePackReportResponseBody body;

    public static GenerateCompliancePackReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCompliancePackReportResponse self = new GenerateCompliancePackReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCompliancePackReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCompliancePackReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCompliancePackReportResponse setBody(GenerateCompliancePackReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCompliancePackReportResponseBody getBody() {
        return this.body;
    }

}
