// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeInstanceReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceReleaseResponseBody body;

    public static DescribeInstanceReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceReleaseResponse self = new DescribeInstanceReleaseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceReleaseResponse setBody(DescribeInstanceReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceReleaseResponseBody getBody() {
        return this.body;
    }

}
