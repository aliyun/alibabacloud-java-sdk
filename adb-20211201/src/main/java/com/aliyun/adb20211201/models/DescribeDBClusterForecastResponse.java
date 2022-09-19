// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterForecastResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterForecastResponseBody body;

    public static DescribeDBClusterForecastResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterForecastResponse self = new DescribeDBClusterForecastResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterForecastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterForecastResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterForecastResponse setBody(DescribeDBClusterForecastResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterForecastResponseBody getBody() {
        return this.body;
    }

}
