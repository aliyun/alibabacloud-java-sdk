// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskSecurityGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskSecurityGroupDetailResponseBody body;

    public static DescribeRiskSecurityGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskSecurityGroupDetailResponse self = new DescribeRiskSecurityGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskSecurityGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskSecurityGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskSecurityGroupDetailResponse setBody(DescribeRiskSecurityGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskSecurityGroupDetailResponseBody getBody() {
        return this.body;
    }

}
