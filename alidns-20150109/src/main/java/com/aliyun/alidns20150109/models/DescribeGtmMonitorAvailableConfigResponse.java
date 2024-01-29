// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmMonitorAvailableConfigResponseBody body;

    public static DescribeGtmMonitorAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorAvailableConfigResponse self = new DescribeGtmMonitorAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmMonitorAvailableConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmMonitorAvailableConfigResponse setBody(DescribeGtmMonitorAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmMonitorAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
