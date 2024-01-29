// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateComplianceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateComplianceSummaryResponseBody body;

    public static GetAggregateComplianceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateComplianceSummaryResponse self = new GetAggregateComplianceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateComplianceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateComplianceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateComplianceSummaryResponse setBody(GetAggregateComplianceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateComplianceSummaryResponseBody getBody() {
        return this.body;
    }

}
