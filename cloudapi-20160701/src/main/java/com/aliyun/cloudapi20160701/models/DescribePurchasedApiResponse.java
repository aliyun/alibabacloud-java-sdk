// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePurchasedApiResponseBody body;

    public static DescribePurchasedApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiResponse self = new DescribePurchasedApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedApiResponse setBody(DescribePurchasedApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedApiResponseBody getBody() {
        return this.body;
    }

}
