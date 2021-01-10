// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceBrandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceBrandResponseBody body;

    public static DescribeDeviceBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceBrandResponse self = new DescribeDeviceBrandResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceBrandResponse setBody(DescribeDeviceBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceBrandResponseBody getBody() {
        return this.body;
    }

}
