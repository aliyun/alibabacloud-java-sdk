// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayResponseBody body;

    public static DescribeGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayResponse self = new DescribeGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayResponse setBody(DescribeGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayResponseBody getBody() {
        return this.body;
    }

}
