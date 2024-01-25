// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePurchasedApiGroupDetailResponseBody body;

    public static DescribePurchasedApiGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupDetailResponse self = new DescribePurchasedApiGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedApiGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedApiGroupDetailResponse setBody(DescribePurchasedApiGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedApiGroupDetailResponseBody getBody() {
        return this.body;
    }

}
