// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortRangeListsResponseBody body;

    public static DescribePortRangeListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListsResponse self = new DescribePortRangeListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortRangeListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortRangeListsResponse setBody(DescribePortRangeListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortRangeListsResponseBody getBody() {
        return this.body;
    }

}
