// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSpotPriceHistoryResponseBody body;

    public static DescribeSpotPriceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryResponse self = new DescribeSpotPriceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpotPriceHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpotPriceHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpotPriceHistoryResponse setBody(DescribeSpotPriceHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpotPriceHistoryResponseBody getBody() {
        return this.body;
    }

}
