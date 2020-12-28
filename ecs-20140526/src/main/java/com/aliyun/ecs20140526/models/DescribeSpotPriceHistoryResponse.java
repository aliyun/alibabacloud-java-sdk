// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSpotPriceHistoryResponse setBody(DescribeSpotPriceHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpotPriceHistoryResponseBody getBody() {
        return this.body;
    }

}
