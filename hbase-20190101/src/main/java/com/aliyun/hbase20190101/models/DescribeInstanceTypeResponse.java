// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTypeResponseBody body;

    public static DescribeInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeResponse self = new DescribeInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTypeResponse setBody(DescribeInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
