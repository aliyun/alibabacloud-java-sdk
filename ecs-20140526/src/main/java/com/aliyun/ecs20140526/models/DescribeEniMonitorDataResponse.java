// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEniMonitorDataResponseBody body;

    public static DescribeEniMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataResponse self = new DescribeEniMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEniMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEniMonitorDataResponse setBody(DescribeEniMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEniMonitorDataResponseBody getBody() {
        return this.body;
    }

}
