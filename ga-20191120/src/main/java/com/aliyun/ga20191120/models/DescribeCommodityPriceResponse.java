// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommodityPriceResponseBody body;

    public static DescribeCommodityPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityPriceResponse self = new DescribeCommodityPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommodityPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommodityPriceResponse setBody(DescribeCommodityPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommodityPriceResponseBody getBody() {
        return this.body;
    }

}
