// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeExcessivePrimaryKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExcessivePrimaryKeysResponseBody body;

    public static DescribeExcessivePrimaryKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcessivePrimaryKeysResponse self = new DescribeExcessivePrimaryKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcessivePrimaryKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExcessivePrimaryKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExcessivePrimaryKeysResponse setBody(DescribeExcessivePrimaryKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExcessivePrimaryKeysResponseBody getBody() {
        return this.body;
    }

}
