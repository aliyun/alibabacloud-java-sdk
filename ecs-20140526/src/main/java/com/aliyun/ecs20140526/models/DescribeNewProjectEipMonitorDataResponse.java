// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNewProjectEipMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNewProjectEipMonitorDataResponseBody body;

    public static DescribeNewProjectEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewProjectEipMonitorDataResponse self = new DescribeNewProjectEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNewProjectEipMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNewProjectEipMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNewProjectEipMonitorDataResponse setBody(DescribeNewProjectEipMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNewProjectEipMonitorDataResponseBody getBody() {
        return this.body;
    }

}
