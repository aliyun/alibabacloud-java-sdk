// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingRiskTrendResponseBody body;

    public static DescribeOutgoingRiskTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingRiskTrendResponse self = new DescribeOutgoingRiskTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingRiskTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingRiskTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingRiskTrendResponse setBody(DescribeOutgoingRiskTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingRiskTrendResponseBody getBody() {
        return this.body;
    }

}
