// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionQRCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransactionQRCodeResponseBody body;

    public static DescribeTransactionQRCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionQRCodeResponse self = new DescribeTransactionQRCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionQRCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransactionQRCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransactionQRCodeResponse setBody(DescribeTransactionQRCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransactionQRCodeResponseBody getBody() {
        return this.body;
    }

}
