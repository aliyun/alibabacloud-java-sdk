// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeSpotDiscountHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSpotDiscountHistoryResponseBody body;

    public static DescribeSpotDiscountHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotDiscountHistoryResponse self = new DescribeSpotDiscountHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpotDiscountHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpotDiscountHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpotDiscountHistoryResponse setBody(DescribeSpotDiscountHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpotDiscountHistoryResponseBody getBody() {
        return this.body;
    }

}
