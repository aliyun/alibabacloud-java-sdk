// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeILMPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeILMPolicyResponseBody body;

    public static DescribeILMPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeILMPolicyResponse self = new DescribeILMPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeILMPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeILMPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeILMPolicyResponse setBody(DescribeILMPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeILMPolicyResponseBody getBody() {
        return this.body;
    }

}
