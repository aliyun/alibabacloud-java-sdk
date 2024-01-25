// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeResourceMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceMetricResponseBody body;

    public static DescribeResourceMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceMetricResponse self = new DescribeResourceMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceMetricResponse setBody(DescribeResourceMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceMetricResponseBody getBody() {
        return this.body;
    }

}
