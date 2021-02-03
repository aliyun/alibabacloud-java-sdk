// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeGtmMonitorAvailableConfigResponse setBody(DescribeGtmMonitorAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmMonitorAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
