// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCategoriesResponseBody body;

    public static DescribeCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoriesResponse self = new DescribeCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCategoriesResponse setBody(DescribeCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCategoriesResponseBody getBody() {
        return this.body;
    }

}
