// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribePrePaidResourceRefundPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePrePaidResourceRefundPriceResponseBody body;

    public static DescribePrePaidResourceRefundPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidResourceRefundPriceResponse self = new DescribePrePaidResourceRefundPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidResourceRefundPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrePaidResourceRefundPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrePaidResourceRefundPriceResponse setBody(DescribePrePaidResourceRefundPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrePaidResourceRefundPriceResponseBody getBody() {
        return this.body;
    }

}
