// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeInstanceMembersResponse setBody(DescribeInstanceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMembersResponseBody getBody() {
        return this.body;
    }

}
