// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody body;

    public static DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse self = new DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse setBody(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody getBody() {
        return this.body;
    }

}
