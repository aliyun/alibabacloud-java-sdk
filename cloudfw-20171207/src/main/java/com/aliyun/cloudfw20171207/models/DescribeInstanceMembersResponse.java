// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceMembersResponseBody body;

    public static DescribeInstanceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMembersResponse self = new DescribeInstanceMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceMembersResponse setBody(DescribeInstanceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMembersResponseBody getBody() {
        return this.body;
    }

}
