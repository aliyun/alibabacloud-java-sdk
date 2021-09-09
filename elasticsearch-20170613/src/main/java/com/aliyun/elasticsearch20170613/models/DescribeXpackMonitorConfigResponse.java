// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeXpackMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeXpackMonitorConfigResponse setBody(DescribeXpackMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeXpackMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
