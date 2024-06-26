// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceTypeResponseBody body;

    public static DescribeResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypeResponse self = new DescribeResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceTypeResponse setBody(DescribeResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceTypeResponseBody getBody() {
        return this.body;
    }

}
