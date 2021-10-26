// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceLatencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceLatencyResponseBody body;

    public static DescribeInstanceLatencyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLatencyResponse self = new DescribeInstanceLatencyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLatencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceLatencyResponse setBody(DescribeInstanceLatencyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceLatencyResponseBody getBody() {
        return this.body;
    }

}
