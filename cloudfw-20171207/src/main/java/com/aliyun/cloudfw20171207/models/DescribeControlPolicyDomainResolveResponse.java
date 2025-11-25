// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyDomainResolveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeControlPolicyDomainResolveResponseBody body;

    public static DescribeControlPolicyDomainResolveResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyDomainResolveResponse self = new DescribeControlPolicyDomainResolveResponse();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyDomainResolveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeControlPolicyDomainResolveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeControlPolicyDomainResolveResponse setBody(DescribeControlPolicyDomainResolveResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeControlPolicyDomainResolveResponseBody getBody() {
        return this.body;
    }

}
