// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUserLoginPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserLoginPoliciesResponseBody body;

    public static DescribeUserLoginPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLoginPoliciesResponse self = new DescribeUserLoginPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLoginPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLoginPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserLoginPoliciesResponse setBody(DescribeUserLoginPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLoginPoliciesResponseBody getBody() {
        return this.body;
    }

}
