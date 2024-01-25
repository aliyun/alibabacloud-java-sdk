// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResultSeveritySummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskResultSeveritySummaryResponseBody body;

    public static DescribeRiskResultSeveritySummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResultSeveritySummaryResponse self = new DescribeRiskResultSeveritySummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResultSeveritySummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskResultSeveritySummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskResultSeveritySummaryResponse setBody(DescribeRiskResultSeveritySummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskResultSeveritySummaryResponseBody getBody() {
        return this.body;
    }

}
