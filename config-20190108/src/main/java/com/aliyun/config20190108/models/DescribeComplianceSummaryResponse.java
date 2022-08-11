// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComplianceSummaryResponseBody body;

    public static DescribeComplianceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceSummaryResponse self = new DescribeComplianceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComplianceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComplianceSummaryResponse setBody(DescribeComplianceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComplianceSummaryResponseBody getBody() {
        return this.body;
    }

}
