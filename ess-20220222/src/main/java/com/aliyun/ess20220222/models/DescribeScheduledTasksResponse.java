// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScheduledTasksResponseBody body;

    public static DescribeScheduledTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTasksResponse self = new DescribeScheduledTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduledTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScheduledTasksResponse setBody(DescribeScheduledTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduledTasksResponseBody getBody() {
        return this.body;
    }

}
