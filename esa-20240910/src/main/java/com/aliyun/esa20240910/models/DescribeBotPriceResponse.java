// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeBotPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBotPriceResponseBody body;

    public static DescribeBotPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotPriceResponse self = new DescribeBotPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBotPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBotPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBotPriceResponse setBody(DescribeBotPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBotPriceResponseBody getBody() {
        return this.body;
    }

}
