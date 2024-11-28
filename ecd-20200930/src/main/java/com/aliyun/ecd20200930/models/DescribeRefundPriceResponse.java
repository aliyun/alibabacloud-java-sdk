// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRefundPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRefundPriceResponseBody body;

    public static DescribeRefundPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefundPriceResponse self = new DescribeRefundPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRefundPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRefundPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRefundPriceResponse setBody(DescribeRefundPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRefundPriceResponseBody getBody() {
        return this.body;
    }

}
