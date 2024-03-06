// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKeyResponseBody body;

    public static DescribeKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyResponse self = new DescribeKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKeyResponse setBody(DescribeKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeyResponseBody getBody() {
        return this.body;
    }

}
