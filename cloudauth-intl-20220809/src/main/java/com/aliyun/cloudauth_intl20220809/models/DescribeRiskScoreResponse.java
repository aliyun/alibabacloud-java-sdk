// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeRiskScoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRiskScoreResponseBody body;

    public static DescribeRiskScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskScoreResponse self = new DescribeRiskScoreResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskScoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskScoreResponse setBody(DescribeRiskScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskScoreResponseBody getBody() {
        return this.body;
    }

}
