// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateGovernanceReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateGovernanceReportResponseBody body;

    public static GenerateGovernanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateGovernanceReportResponse self = new GenerateGovernanceReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateGovernanceReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateGovernanceReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateGovernanceReportResponse setBody(GenerateGovernanceReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateGovernanceReportResponseBody getBody() {
        return this.body;
    }

}
