// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomLogConfigResponseBody body;

    public static DescribeCustomLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLogConfigResponse self = new DescribeCustomLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomLogConfigResponse setBody(DescribeCustomLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomLogConfigResponseBody getBody() {
        return this.body;
    }

}
