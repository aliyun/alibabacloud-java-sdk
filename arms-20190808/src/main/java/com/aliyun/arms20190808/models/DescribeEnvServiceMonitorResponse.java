// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvServiceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnvServiceMonitorResponseBody body;

    public static DescribeEnvServiceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvServiceMonitorResponse self = new DescribeEnvServiceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvServiceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvServiceMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnvServiceMonitorResponse setBody(DescribeEnvServiceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvServiceMonitorResponseBody getBody() {
        return this.body;
    }

}
