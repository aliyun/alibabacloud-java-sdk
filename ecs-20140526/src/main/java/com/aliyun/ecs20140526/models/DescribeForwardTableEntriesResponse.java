// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeForwardTableEntriesResponseBody body;

    public static DescribeForwardTableEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponse self = new DescribeForwardTableEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeForwardTableEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeForwardTableEntriesResponse setBody(DescribeForwardTableEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeForwardTableEntriesResponseBody getBody() {
        return this.body;
    }

}
