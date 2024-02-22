// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorGroupInstancesResponseBody body;

    public static DescribeMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesResponse self = new DescribeMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorGroupInstancesResponse setBody(DescribeMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
