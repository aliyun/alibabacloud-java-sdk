// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventStatisticResponseBody body;

    public static DescribeRiskEventStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventStatisticResponse self = new DescribeRiskEventStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventStatisticResponse setBody(DescribeRiskEventStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventStatisticResponseBody getBody() {
        return this.body;
    }

}
