// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRiskLevelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRiskLevelsResponseBody body;

    public static DescribeInstanceRiskLevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRiskLevelsResponse self = new DescribeInstanceRiskLevelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRiskLevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRiskLevelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRiskLevelsResponse setBody(DescribeInstanceRiskLevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRiskLevelsResponseBody getBody() {
        return this.body;
    }

}
