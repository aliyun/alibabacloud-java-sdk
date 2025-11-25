// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventTopAttackTypeResponseBody body;

    public static DescribeRiskEventTopAttackTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackTypeResponse self = new DescribeRiskEventTopAttackTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventTopAttackTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventTopAttackTypeResponse setBody(DescribeRiskEventTopAttackTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventTopAttackTypeResponseBody getBody() {
        return this.body;
    }

}
