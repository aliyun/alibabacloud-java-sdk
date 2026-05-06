// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRatePlanPriceResponseBody body;

    public static DescribeRatePlanPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanPriceResponse self = new DescribeRatePlanPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRatePlanPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRatePlanPriceResponse setBody(DescribeRatePlanPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRatePlanPriceResponseBody getBody() {
        return this.body;
    }

}
