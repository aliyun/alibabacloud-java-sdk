// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeResourceTypeAutoEnableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceTypeAutoEnableResponseBody body;

    public static DescribeResourceTypeAutoEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypeAutoEnableResponse self = new DescribeResourceTypeAutoEnableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypeAutoEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceTypeAutoEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceTypeAutoEnableResponse setBody(DescribeResourceTypeAutoEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceTypeAutoEnableResponseBody getBody() {
        return this.body;
    }

}
