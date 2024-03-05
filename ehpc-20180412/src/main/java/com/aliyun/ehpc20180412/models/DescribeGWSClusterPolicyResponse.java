// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClusterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeGWSClusterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGWSClusterPolicyResponse setBody(DescribeGWSClusterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGWSClusterPolicyResponseBody getBody() {
        return this.body;
    }

}
