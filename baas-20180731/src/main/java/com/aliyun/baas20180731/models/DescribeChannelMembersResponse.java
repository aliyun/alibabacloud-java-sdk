// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelMembersResponseBody body;

    public static DescribeChannelMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelMembersResponse self = new DescribeChannelMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelMembersResponse setBody(DescribeChannelMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelMembersResponseBody getBody() {
        return this.body;
    }

}
