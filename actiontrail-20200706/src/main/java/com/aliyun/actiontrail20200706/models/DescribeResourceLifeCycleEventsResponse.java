// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeResourceLifeCycleEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceLifeCycleEventsResponseBody body;

    public static DescribeResourceLifeCycleEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLifeCycleEventsResponse self = new DescribeResourceLifeCycleEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLifeCycleEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceLifeCycleEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceLifeCycleEventsResponse setBody(DescribeResourceLifeCycleEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceLifeCycleEventsResponseBody getBody() {
        return this.body;
    }

}
