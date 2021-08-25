// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateCompliancePackReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateAggregateCompliancePackReportResponse setBody(GenerateAggregateCompliancePackReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAggregateCompliancePackReportResponseBody getBody() {
        return this.body;
    }

}
