// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmMonitorConfigResponseBody body;

    public static DescribeGtmMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigResponse self = new DescribeGtmMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmMonitorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmMonitorConfigResponse setBody(DescribeGtmMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
