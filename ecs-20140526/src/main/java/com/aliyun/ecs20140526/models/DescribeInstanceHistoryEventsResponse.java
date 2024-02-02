// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceHistoryEventsResponseBody body;

    public static DescribeInstanceHistoryEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHistoryEventsResponse self = new DescribeInstanceHistoryEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHistoryEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceHistoryEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceHistoryEventsResponse setBody(DescribeInstanceHistoryEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceHistoryEventsResponseBody getBody() {
        return this.body;
    }

}
