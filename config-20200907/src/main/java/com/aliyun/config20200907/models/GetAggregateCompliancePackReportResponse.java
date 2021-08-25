// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAggregateCompliancePackReportResponse setBody(GetAggregateCompliancePackReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateCompliancePackReportResponseBody getBody() {
        return this.body;
    }

}
