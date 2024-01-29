// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateCompliancePackReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAggregateCompliancePackReportResponseBody body;

    public static GenerateAggregateCompliancePackReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateCompliancePackReportResponse self = new GenerateAggregateCompliancePackReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateCompliancePackReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAggregateCompliancePackReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAggregateCompliancePackReportResponse setBody(GenerateAggregateCompliancePackReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAggregateCompliancePackReportResponseBody getBody() {
        return this.body;
    }

}
