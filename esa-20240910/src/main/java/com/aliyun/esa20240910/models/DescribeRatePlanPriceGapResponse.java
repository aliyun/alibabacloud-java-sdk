// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanPriceGapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRatePlanPriceGapResponseBody body;

    public static DescribeRatePlanPriceGapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanPriceGapResponse self = new DescribeRatePlanPriceGapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanPriceGapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRatePlanPriceGapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRatePlanPriceGapResponse setBody(DescribeRatePlanPriceGapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRatePlanPriceGapResponseBody getBody() {
        return this.body;
    }

}
