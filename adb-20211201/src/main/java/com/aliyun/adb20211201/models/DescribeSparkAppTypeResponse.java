// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAppTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkAppTypeResponseBody body;

    public static DescribeSparkAppTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAppTypeResponse self = new DescribeSparkAppTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAppTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkAppTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkAppTypeResponse setBody(DescribeSparkAppTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkAppTypeResponseBody getBody() {
        return this.body;
    }

}
