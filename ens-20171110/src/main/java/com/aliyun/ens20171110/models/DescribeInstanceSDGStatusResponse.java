// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSDGStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSDGStatusResponseBody body;

    public static DescribeInstanceSDGStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSDGStatusResponse self = new DescribeInstanceSDGStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSDGStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSDGStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSDGStatusResponse setBody(DescribeInstanceSDGStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSDGStatusResponseBody getBody() {
        return this.body;
    }

}
