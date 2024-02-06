// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBResourcePoolResponseBody body;

    public static DescribeDBResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourcePoolResponse self = new DescribeDBResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBResourcePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBResourcePoolResponse setBody(DescribeDBResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBResourcePoolResponseBody getBody() {
        return this.body;
    }

}
