// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribePurchasedApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePurchasedApisResponseBody body;

    public static DescribePurchasedApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApisResponse self = new DescribePurchasedApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedApisResponse setBody(DescribePurchasedApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedApisResponseBody getBody() {
        return this.body;
    }

}
