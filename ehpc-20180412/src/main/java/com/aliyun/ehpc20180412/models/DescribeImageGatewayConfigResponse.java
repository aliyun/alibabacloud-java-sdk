// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageGatewayConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeImageGatewayConfigResponse setBody(DescribeImageGatewayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageGatewayConfigResponseBody getBody() {
        return this.body;
    }

}
