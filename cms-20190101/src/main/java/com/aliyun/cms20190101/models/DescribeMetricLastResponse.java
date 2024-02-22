// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricLastResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricLastResponseBody body;

    public static DescribeMetricLastResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricLastResponse self = new DescribeMetricLastResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricLastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricLastResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricLastResponse setBody(DescribeMetricLastResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricLastResponseBody getBody() {
        return this.body;
    }

}
