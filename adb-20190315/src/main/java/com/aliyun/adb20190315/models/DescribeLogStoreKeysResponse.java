// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLogStoreKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogStoreKeysResponseBody body;

    public static DescribeLogStoreKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreKeysResponse self = new DescribeLogStoreKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogStoreKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogStoreKeysResponse setBody(DescribeLogStoreKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogStoreKeysResponseBody getBody() {
        return this.body;
    }

}
