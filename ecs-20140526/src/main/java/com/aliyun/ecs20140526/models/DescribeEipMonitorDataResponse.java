// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEipMonitorDataResponseBody body;

    public static DescribeEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipMonitorDataResponse self = new DescribeEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipMonitorDataResponse setBody(DescribeEipMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipMonitorDataResponseBody getBody() {
        return this.body;
    }

}
