// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateCompliancePackReportResponseBody body;

    public static GetAggregateCompliancePackReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackReportResponse self = new GetAggregateCompliancePackReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateCompliancePackReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateCompliancePackReportResponse setBody(GetAggregateCompliancePackReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateCompliancePackReportResponseBody getBody() {
        return this.body;
    }

}
