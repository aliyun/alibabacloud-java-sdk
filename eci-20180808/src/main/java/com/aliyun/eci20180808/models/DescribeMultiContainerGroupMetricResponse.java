// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeMultiContainerGroupMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultiContainerGroupMetricResponseBody body;

    public static DescribeMultiContainerGroupMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiContainerGroupMetricResponse self = new DescribeMultiContainerGroupMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiContainerGroupMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiContainerGroupMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultiContainerGroupMetricResponse setBody(DescribeMultiContainerGroupMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiContainerGroupMetricResponseBody getBody() {
        return this.body;
    }

}
