// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortRangeListEntriesResponseBody body;

    public static DescribePortRangeListEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListEntriesResponse self = new DescribePortRangeListEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortRangeListEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortRangeListEntriesResponse setBody(DescribePortRangeListEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortRangeListEntriesResponseBody getBody() {
        return this.body;
    }

}
