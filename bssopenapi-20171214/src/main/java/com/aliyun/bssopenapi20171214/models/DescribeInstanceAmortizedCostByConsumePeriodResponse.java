// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByConsumePeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAmortizedCostByConsumePeriodResponseBody body;

    public static DescribeInstanceAmortizedCostByConsumePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByConsumePeriodResponse self = new DescribeInstanceAmortizedCostByConsumePeriodResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByConsumePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodResponse setBody(DescribeInstanceAmortizedCostByConsumePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAmortizedCostByConsumePeriodResponseBody getBody() {
        return this.body;
    }

}
