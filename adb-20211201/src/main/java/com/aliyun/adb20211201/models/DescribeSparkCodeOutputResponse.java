// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkCodeOutputResponseBody body;

    public static DescribeSparkCodeOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeOutputResponse self = new DescribeSparkCodeOutputResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkCodeOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkCodeOutputResponse setBody(DescribeSparkCodeOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkCodeOutputResponseBody getBody() {
        return this.body;
    }

}
