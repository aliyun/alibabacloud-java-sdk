// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeInstancePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancePolicyResponseBody body;

    public static DescribeInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePolicyResponse self = new DescribeInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancePolicyResponse setBody(DescribeInstancePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancePolicyResponseBody getBody() {
        return this.body;
    }

}
