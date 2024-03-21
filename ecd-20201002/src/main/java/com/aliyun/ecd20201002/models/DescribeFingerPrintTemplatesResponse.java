// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeFingerPrintTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFingerPrintTemplatesResponseBody body;

    public static DescribeFingerPrintTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFingerPrintTemplatesResponse self = new DescribeFingerPrintTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFingerPrintTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFingerPrintTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFingerPrintTemplatesResponse setBody(DescribeFingerPrintTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFingerPrintTemplatesResponseBody getBody() {
        return this.body;
    }

}
