// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCSIGatewayEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCSIGatewayEndpointResponseBody body;

    public static DescribeCSIGatewayEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSIGatewayEndpointResponse self = new DescribeCSIGatewayEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCSIGatewayEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCSIGatewayEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCSIGatewayEndpointResponse setBody(DescribeCSIGatewayEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCSIGatewayEndpointResponseBody getBody() {
        return this.body;
    }

}
