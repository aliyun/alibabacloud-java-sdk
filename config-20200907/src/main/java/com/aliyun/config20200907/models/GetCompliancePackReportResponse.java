// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCompliancePackReportResponseBody body;

    public static GetCompliancePackReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackReportResponse self = new GetCompliancePackReportResponse();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompliancePackReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCompliancePackReportResponse setBody(GetCompliancePackReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompliancePackReportResponseBody getBody() {
        return this.body;
    }

}
