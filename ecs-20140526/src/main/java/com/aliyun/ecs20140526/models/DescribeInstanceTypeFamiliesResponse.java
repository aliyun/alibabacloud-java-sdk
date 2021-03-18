// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTypeFamiliesResponseBody body;

    public static DescribeInstanceTypeFamiliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesResponse self = new DescribeInstanceTypeFamiliesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeFamiliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTypeFamiliesResponse setBody(DescribeInstanceTypeFamiliesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTypeFamiliesResponseBody getBody() {
        return this.body;
    }

}
