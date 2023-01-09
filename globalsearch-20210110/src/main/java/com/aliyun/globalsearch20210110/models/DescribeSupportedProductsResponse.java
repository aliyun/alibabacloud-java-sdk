// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeSupportedProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSupportedProductsResponseBody body;

    public static DescribeSupportedProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedProductsResponse self = new DescribeSupportedProductsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportedProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportedProductsResponse setBody(DescribeSupportedProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportedProductsResponseBody getBody() {
        return this.body;
    }

}
