// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetComplianceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetComplianceSummaryResponseBody body;

    public static GetComplianceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComplianceSummaryResponse self = new GetComplianceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetComplianceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComplianceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComplianceSummaryResponse setBody(GetComplianceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComplianceSummaryResponseBody getBody() {
        return this.body;
    }

}
