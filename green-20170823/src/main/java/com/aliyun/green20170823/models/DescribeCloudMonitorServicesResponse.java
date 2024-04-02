// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudMonitorServicesResponseBody body;

    public static DescribeCloudMonitorServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMonitorServicesResponse self = new DescribeCloudMonitorServicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMonitorServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudMonitorServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudMonitorServicesResponse setBody(DescribeCloudMonitorServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudMonitorServicesResponseBody getBody() {
        return this.body;
    }

}
