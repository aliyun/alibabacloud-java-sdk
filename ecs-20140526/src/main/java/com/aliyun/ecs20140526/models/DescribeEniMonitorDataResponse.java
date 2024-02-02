// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEniMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEniMonitorDataResponse setBody(DescribeEniMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEniMonitorDataResponseBody getBody() {
        return this.body;
    }

}
