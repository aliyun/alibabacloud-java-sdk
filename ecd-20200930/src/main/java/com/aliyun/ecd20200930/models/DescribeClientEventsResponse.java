// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClientEventsResponseBody body;

    public static DescribeClientEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientEventsResponse self = new DescribeClientEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientEventsResponse setBody(DescribeClientEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientEventsResponseBody getBody() {
        return this.body;
    }

}
