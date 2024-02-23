// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePackageStateResponseBody body;

    public static DescribePackageStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageStateResponse self = new DescribePackageStateResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackageStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackageStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePackageStateResponse setBody(DescribePackageStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackageStateResponseBody getBody() {
        return this.body;
    }

}
