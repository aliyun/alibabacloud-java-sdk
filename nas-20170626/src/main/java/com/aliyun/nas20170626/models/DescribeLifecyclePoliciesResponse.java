// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLifecyclePoliciesResponse setBody(DescribeLifecyclePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLifecyclePoliciesResponseBody getBody() {
        return this.body;
    }

}
