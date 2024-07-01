// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeWebUiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkCodeWebUiResponseBody body;

    public static DescribeSparkCodeWebUiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeWebUiResponse self = new DescribeSparkCodeWebUiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeWebUiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkCodeWebUiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkCodeWebUiResponse setBody(DescribeSparkCodeWebUiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkCodeWebUiResponseBody getBody() {
        return this.body;
    }

}
