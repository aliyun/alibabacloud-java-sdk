// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeControlPolicyResponseBody body;

    public static DescribeControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyResponse self = new DescribeControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeControlPolicyResponse setBody(DescribeControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeControlPolicyResponseBody getBody() {
        return this.body;
    }

}
