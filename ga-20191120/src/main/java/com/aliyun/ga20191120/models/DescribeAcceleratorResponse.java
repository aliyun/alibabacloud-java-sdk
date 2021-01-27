// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAcceleratorResponseBody body;

    public static DescribeAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorResponse self = new DescribeAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAcceleratorResponse setBody(DescribeAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAcceleratorResponseBody getBody() {
        return this.body;
    }

}
