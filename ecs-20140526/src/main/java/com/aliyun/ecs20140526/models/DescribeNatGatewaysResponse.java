// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatGatewaysResponseBody body;

    public static DescribeNatGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponse self = new DescribeNatGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatGatewaysResponse setBody(DescribeNatGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatGatewaysResponseBody getBody() {
        return this.body;
    }

}
