// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitoringConfigResponseBody body;

    public static DescribeMonitoringConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringConfigResponse self = new DescribeMonitoringConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitoringConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitoringConfigResponse setBody(DescribeMonitoringConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitoringConfigResponseBody getBody() {
        return this.body;
    }

}
