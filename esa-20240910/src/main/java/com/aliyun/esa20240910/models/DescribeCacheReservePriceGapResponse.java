// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCacheReservePriceGapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCacheReservePriceGapResponseBody body;

    public static DescribeCacheReservePriceGapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheReservePriceGapResponse self = new DescribeCacheReservePriceGapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheReservePriceGapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCacheReservePriceGapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCacheReservePriceGapResponse setBody(DescribeCacheReservePriceGapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheReservePriceGapResponseBody getBody() {
        return this.body;
    }

}
