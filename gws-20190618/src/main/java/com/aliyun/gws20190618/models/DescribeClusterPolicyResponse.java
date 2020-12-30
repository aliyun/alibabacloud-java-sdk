// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterPolicyResponseBody body;

    public static DescribeClusterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPolicyResponse self = new DescribeClusterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterPolicyResponse setBody(DescribeClusterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterPolicyResponseBody getBody() {
        return this.body;
    }

}
