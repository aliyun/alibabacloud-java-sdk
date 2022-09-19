// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbSparkLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAdbSparkLogsResponseBody body;

    public static DescribeAdbSparkLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbSparkLogsResponse self = new DescribeAdbSparkLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbSparkLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbSparkLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbSparkLogsResponse setBody(DescribeAdbSparkLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbSparkLogsResponseBody getBody() {
        return this.body;
    }

}
