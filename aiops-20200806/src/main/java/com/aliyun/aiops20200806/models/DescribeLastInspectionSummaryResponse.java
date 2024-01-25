// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeLastInspectionSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLastInspectionSummaryResponseBody body;

    public static DescribeLastInspectionSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLastInspectionSummaryResponse self = new DescribeLastInspectionSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLastInspectionSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLastInspectionSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLastInspectionSummaryResponse setBody(DescribeLastInspectionSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLastInspectionSummaryResponseBody getBody() {
        return this.body;
    }

}
