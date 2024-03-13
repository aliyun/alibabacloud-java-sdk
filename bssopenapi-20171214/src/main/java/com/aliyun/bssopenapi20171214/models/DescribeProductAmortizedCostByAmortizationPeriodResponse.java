// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByAmortizationPeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody body;

    public static DescribeProductAmortizedCostByAmortizationPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductAmortizedCostByAmortizationPeriodResponse self = new DescribeProductAmortizedCostByAmortizationPeriodResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponse setBody(DescribeProductAmortizedCostByAmortizationPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody getBody() {
        return this.body;
    }

}
