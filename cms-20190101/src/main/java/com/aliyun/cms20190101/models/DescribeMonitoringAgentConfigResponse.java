// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitoringAgentConfigResponseBody body;

    public static DescribeMonitoringAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentConfigResponse self = new DescribeMonitoringAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitoringAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitoringAgentConfigResponse setBody(DescribeMonitoringAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitoringAgentConfigResponseBody getBody() {
        return this.body;
    }

}
