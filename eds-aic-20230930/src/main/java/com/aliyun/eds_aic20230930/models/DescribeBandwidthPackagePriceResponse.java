// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBandwidthPackagePriceResponseBody body;

    public static DescribeBandwidthPackagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagePriceResponse self = new DescribeBandwidthPackagePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwidthPackagePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBandwidthPackagePriceResponse setBody(DescribeBandwidthPackagePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthPackagePriceResponseBody getBody() {
        return this.body;
    }

}
