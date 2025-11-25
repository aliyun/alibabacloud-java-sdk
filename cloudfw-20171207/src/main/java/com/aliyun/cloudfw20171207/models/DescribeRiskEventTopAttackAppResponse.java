// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventTopAttackAppResponseBody body;

    public static DescribeRiskEventTopAttackAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackAppResponse self = new DescribeRiskEventTopAttackAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventTopAttackAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventTopAttackAppResponse setBody(DescribeRiskEventTopAttackAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventTopAttackAppResponseBody getBody() {
        return this.body;
    }

}
