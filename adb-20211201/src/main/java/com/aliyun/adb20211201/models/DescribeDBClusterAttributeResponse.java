// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterAttributeResponseBody body;

    public static DescribeDBClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponse self = new DescribeDBClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterAttributeResponse setBody(DescribeDBClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
