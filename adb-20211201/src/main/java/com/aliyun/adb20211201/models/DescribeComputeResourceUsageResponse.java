// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeComputeResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComputeResourceUsageResponseBody body;

    public static DescribeComputeResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeResourceUsageResponse self = new DescribeComputeResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComputeResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComputeResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComputeResourceUsageResponse setBody(DescribeComputeResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComputeResourceUsageResponseBody getBody() {
        return this.body;
    }

}
