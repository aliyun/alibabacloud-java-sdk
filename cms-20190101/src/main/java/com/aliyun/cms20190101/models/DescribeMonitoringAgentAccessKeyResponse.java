// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentAccessKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitoringAgentAccessKeyResponseBody body;

    public static DescribeMonitoringAgentAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentAccessKeyResponse self = new DescribeMonitoringAgentAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentAccessKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitoringAgentAccessKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitoringAgentAccessKeyResponse setBody(DescribeMonitoringAgentAccessKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitoringAgentAccessKeyResponseBody getBody() {
        return this.body;
    }

}
