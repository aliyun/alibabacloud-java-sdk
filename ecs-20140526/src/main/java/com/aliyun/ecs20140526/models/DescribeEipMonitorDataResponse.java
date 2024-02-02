// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEipMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEipMonitorDataResponse setBody(DescribeEipMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipMonitorDataResponseBody getBody() {
        return this.body;
    }

}
