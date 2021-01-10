// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceShadowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceShadowResponseBody body;

    public static DescribeDeviceShadowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceShadowResponse self = new DescribeDeviceShadowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceShadowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceShadowResponse setBody(DescribeDeviceShadowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceShadowResponseBody getBody() {
        return this.body;
    }

}
