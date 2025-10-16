// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventTopAttackAssetResponseBody body;

    public static DescribeRiskEventTopAttackAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackAssetResponse self = new DescribeRiskEventTopAttackAssetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventTopAttackAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventTopAttackAssetResponse setBody(DescribeRiskEventTopAttackAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventTopAttackAssetResponseBody getBody() {
        return this.body;
    }

}
