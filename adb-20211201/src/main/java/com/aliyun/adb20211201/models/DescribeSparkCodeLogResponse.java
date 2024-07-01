// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkCodeLogResponseBody body;

    public static DescribeSparkCodeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeLogResponse self = new DescribeSparkCodeLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkCodeLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkCodeLogResponse setBody(DescribeSparkCodeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkCodeLogResponseBody getBody() {
        return this.body;
    }

}
