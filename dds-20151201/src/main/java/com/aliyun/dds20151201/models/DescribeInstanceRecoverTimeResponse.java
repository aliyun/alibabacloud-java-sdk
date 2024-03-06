// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeInstanceRecoverTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRecoverTimeResponseBody body;

    public static DescribeInstanceRecoverTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRecoverTimeResponse self = new DescribeInstanceRecoverTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRecoverTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRecoverTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRecoverTimeResponse setBody(DescribeInstanceRecoverTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRecoverTimeResponseBody getBody() {
        return this.body;
    }

}
