// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricResponseBody body;

    public static DescribeMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricResponse self = new DescribeMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricResponse setBody(DescribeMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricResponseBody getBody() {
        return this.body;
    }

}
