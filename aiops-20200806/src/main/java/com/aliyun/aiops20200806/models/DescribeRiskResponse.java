// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskResponseBody body;

    public static DescribeRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResponse self = new DescribeRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskResponse setBody(DescribeRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskResponseBody getBody() {
        return this.body;
    }

}
