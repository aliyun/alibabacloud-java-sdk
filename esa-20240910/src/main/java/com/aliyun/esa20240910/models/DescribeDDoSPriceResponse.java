// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSPriceResponseBody body;

    public static DescribeDDoSPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSPriceResponse self = new DescribeDDoSPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSPriceResponse setBody(DescribeDDoSPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSPriceResponseBody getBody() {
        return this.body;
    }

}
