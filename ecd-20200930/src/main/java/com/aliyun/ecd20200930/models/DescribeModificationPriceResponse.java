// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModificationPriceResponseBody body;

    public static DescribeModificationPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModificationPriceResponse self = new DescribeModificationPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModificationPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModificationPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModificationPriceResponse setBody(DescribeModificationPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModificationPriceResponseBody getBody() {
        return this.body;
    }

}
