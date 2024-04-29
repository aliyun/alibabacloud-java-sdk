// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLayer4RulePolicyResponseBody body;

    public static DescribeLayer4RulePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulePolicyResponse self = new DescribeLayer4RulePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLayer4RulePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLayer4RulePolicyResponse setBody(DescribeLayer4RulePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLayer4RulePolicyResponseBody getBody() {
        return this.body;
    }

}
