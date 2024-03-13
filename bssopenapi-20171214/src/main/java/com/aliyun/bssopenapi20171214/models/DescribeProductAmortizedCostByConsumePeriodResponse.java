// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByConsumePeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductAmortizedCostByConsumePeriodResponseBody body;

    public static DescribeProductAmortizedCostByConsumePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductAmortizedCostByConsumePeriodResponse self = new DescribeProductAmortizedCostByConsumePeriodResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductAmortizedCostByConsumePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductAmortizedCostByConsumePeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductAmortizedCostByConsumePeriodResponse setBody(DescribeProductAmortizedCostByConsumePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductAmortizedCostByConsumePeriodResponseBody getBody() {
        return this.body;
    }

}
