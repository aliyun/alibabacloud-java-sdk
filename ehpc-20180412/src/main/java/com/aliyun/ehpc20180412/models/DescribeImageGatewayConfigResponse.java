// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageGatewayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageGatewayConfigResponseBody body;

    public static DescribeImageGatewayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGatewayConfigResponse self = new DescribeImageGatewayConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageGatewayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageGatewayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageGatewayConfigResponse setBody(DescribeImageGatewayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageGatewayConfigResponseBody getBody() {
        return this.body;
    }

}
