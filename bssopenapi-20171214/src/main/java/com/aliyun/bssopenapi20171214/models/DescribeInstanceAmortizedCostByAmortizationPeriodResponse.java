// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByAmortizationPeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody body;

    public static DescribeInstanceAmortizedCostByAmortizationPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByAmortizationPeriodResponse self = new DescribeInstanceAmortizedCostByAmortizationPeriodResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponse setBody(DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody getBody() {
        return this.body;
    }

}
