// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeClientEventsResponse setBody(DescribeClientEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientEventsResponseBody getBody() {
        return this.body;
    }

}
