// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageSharePermissionResponseBody body;

    public static DescribeImageSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionResponse self = new DescribeImageSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageSharePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageSharePermissionResponse setBody(DescribeImageSharePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageSharePermissionResponseBody getBody() {
        return this.body;
    }

}
