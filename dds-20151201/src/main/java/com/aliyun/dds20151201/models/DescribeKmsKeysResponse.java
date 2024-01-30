// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKmsKeysResponseBody body;

    public static DescribeKmsKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysResponse self = new DescribeKmsKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKmsKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKmsKeysResponse setBody(DescribeKmsKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKmsKeysResponseBody getBody() {
        return this.body;
    }

}
