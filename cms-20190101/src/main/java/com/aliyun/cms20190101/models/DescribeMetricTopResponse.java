// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricTopResponseBody body;

    public static DescribeMetricTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopResponse self = new DescribeMetricTopResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricTopResponse setBody(DescribeMetricTopResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricTopResponseBody getBody() {
        return this.body;
    }

}
