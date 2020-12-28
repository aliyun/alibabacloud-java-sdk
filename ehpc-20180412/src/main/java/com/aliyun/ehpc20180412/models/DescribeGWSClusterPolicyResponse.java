// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClusterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGWSClusterPolicyResponseBody body;

    public static DescribeGWSClusterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClusterPolicyResponse self = new DescribeGWSClusterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClusterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGWSClusterPolicyResponse setBody(DescribeGWSClusterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGWSClusterPolicyResponseBody getBody() {
        return this.body;
    }

}
