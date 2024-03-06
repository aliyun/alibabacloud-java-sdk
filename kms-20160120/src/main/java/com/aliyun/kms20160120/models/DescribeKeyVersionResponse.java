// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKeyVersionResponseBody body;

    public static DescribeKeyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionResponse self = new DescribeKeyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKeyVersionResponse setBody(DescribeKeyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeyVersionResponseBody getBody() {
        return this.body;
    }

}
