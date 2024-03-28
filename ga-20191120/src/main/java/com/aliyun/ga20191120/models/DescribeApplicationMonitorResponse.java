// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationMonitorResponseBody body;

    public static DescribeApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationMonitorResponse self = new DescribeApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationMonitorResponse setBody(DescribeApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
