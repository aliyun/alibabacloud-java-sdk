// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeIpControlPolicyItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpControlPolicyItemsResponseBody body;

    public static DescribeIpControlPolicyItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlPolicyItemsResponse self = new DescribeIpControlPolicyItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlPolicyItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpControlPolicyItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpControlPolicyItemsResponse setBody(DescribeIpControlPolicyItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpControlPolicyItemsResponseBody getBody() {
        return this.body;
    }

}
