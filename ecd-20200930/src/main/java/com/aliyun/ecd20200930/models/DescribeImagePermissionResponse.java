// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImagePermissionResponseBody body;

    public static DescribeImagePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePermissionResponse self = new DescribeImagePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImagePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImagePermissionResponse setBody(DescribeImagePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImagePermissionResponseBody getBody() {
        return this.body;
    }

}
