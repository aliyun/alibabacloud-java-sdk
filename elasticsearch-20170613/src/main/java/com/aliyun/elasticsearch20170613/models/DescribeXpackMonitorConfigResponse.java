// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeXpackMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeXpackMonitorConfigResponseBody body;

    public static DescribeXpackMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeXpackMonitorConfigResponse self = new DescribeXpackMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeXpackMonitorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeXpackMonitorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeXpackMonitorConfigResponse setBody(DescribeXpackMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeXpackMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
