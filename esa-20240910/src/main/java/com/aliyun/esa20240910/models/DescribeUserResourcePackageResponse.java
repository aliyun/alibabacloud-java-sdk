// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserResourcePackageResponseBody body;

    public static DescribeUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResourcePackageResponse self = new DescribeUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserResourcePackageResponse setBody(DescribeUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
