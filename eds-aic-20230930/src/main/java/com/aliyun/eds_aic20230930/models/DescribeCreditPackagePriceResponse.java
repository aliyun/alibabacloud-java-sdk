// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackagePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreditPackagePriceResponseBody body;

    public static DescribeCreditPackagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackagePriceResponse self = new DescribeCreditPackagePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackagePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreditPackagePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreditPackagePriceResponse setBody(DescribeCreditPackagePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreditPackagePriceResponseBody getBody() {
        return this.body;
    }

}
