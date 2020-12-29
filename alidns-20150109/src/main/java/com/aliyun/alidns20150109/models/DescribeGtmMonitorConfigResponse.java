// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeGtmMonitorConfigResponse setBody(DescribeGtmMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
