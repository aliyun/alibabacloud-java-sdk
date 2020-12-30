// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceListResponseBody body;

    public static DescribeInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListResponse self = new DescribeInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceListResponse setBody(DescribeInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceListResponseBody getBody() {
        return this.body;
    }

}
