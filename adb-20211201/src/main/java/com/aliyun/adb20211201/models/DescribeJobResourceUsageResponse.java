// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeJobResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobResourceUsageResponseBody body;

    public static DescribeJobResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResourceUsageResponse self = new DescribeJobResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobResourceUsageResponse setBody(DescribeJobResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobResourceUsageResponseBody getBody() {
        return this.body;
    }

}
