// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLifecyclePoliciesResponseBody body;

    public static DescribeLifecyclePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePoliciesResponse self = new DescribeLifecyclePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLifecyclePoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLifecyclePoliciesResponse setBody(DescribeLifecyclePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLifecyclePoliciesResponseBody getBody() {
        return this.body;
    }

}
