// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvPodMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnvPodMonitorResponseBody body;

    public static DescribeEnvPodMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvPodMonitorResponse self = new DescribeEnvPodMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvPodMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvPodMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnvPodMonitorResponse setBody(DescribeEnvPodMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvPodMonitorResponseBody getBody() {
        return this.body;
    }

}
