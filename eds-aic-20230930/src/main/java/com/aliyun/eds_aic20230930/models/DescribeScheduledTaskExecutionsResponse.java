// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeScheduledTaskExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScheduledTaskExecutionsResponseBody body;

    public static DescribeScheduledTaskExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTaskExecutionsResponse self = new DescribeScheduledTaskExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTaskExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduledTaskExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScheduledTaskExecutionsResponse setBody(DescribeScheduledTaskExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduledTaskExecutionsResponseBody getBody() {
        return this.body;
    }

}
