// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3RiskScoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWeb3RiskScoreResponseBody body;

    public static DescribeWeb3RiskScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3RiskScoreResponse self = new DescribeWeb3RiskScoreResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3RiskScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWeb3RiskScoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWeb3RiskScoreResponse setBody(DescribeWeb3RiskScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWeb3RiskScoreResponseBody getBody() {
        return this.body;
    }

}
