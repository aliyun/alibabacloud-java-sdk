// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceMonitorDataResponseBody body;

    public static DescribeInstanceMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataResponse self = new DescribeInstanceMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceMonitorDataResponse setBody(DescribeInstanceMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMonitorDataResponseBody getBody() {
        return this.body;
    }

}
