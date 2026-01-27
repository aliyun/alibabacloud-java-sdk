// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAutoRepairPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoRepairPolicyResponseBody body;

    public static DescribeAutoRepairPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRepairPolicyResponse self = new DescribeAutoRepairPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRepairPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoRepairPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoRepairPolicyResponse setBody(DescribeAutoRepairPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoRepairPolicyResponseBody getBody() {
        return this.body;
    }

}
