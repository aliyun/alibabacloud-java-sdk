// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeInstanceHistoryEventsResponse setBody(DescribeInstanceHistoryEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceHistoryEventsResponseBody getBody() {
        return this.body;
    }

}
