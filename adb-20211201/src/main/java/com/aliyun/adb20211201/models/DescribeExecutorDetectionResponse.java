// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeExecutorDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExecutorDetectionResponseBody body;

    public static DescribeExecutorDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutorDetectionResponse self = new DescribeExecutorDetectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExecutorDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExecutorDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExecutorDetectionResponse setBody(DescribeExecutorDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExecutorDetectionResponseBody getBody() {
        return this.body;
    }

}
