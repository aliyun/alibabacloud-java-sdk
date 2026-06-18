// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCacheReservePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCacheReservePriceResponseBody body;

    public static DescribeCacheReservePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheReservePriceResponse self = new DescribeCacheReservePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheReservePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCacheReservePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCacheReservePriceResponse setBody(DescribeCacheReservePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheReservePriceResponseBody getBody() {
        return this.body;
    }

}
