// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBandwidthPriceResponseBody body;

    public static DescribeBandwidthPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPriceResponse self = new DescribeBandwidthPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwidthPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBandwidthPriceResponse setBody(DescribeBandwidthPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthPriceResponseBody getBody() {
        return this.body;
    }

}
