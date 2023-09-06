// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody body;

    public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse self = new DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse setBody(DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody getBody() {
        return this.body;
    }

}
