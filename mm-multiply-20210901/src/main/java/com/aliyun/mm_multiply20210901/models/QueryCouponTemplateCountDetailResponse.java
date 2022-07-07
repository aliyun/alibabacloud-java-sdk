// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryCouponTemplateCountDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCouponTemplateCountDetailResponseBody body;

    public static QueryCouponTemplateCountDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponTemplateCountDetailResponse self = new QueryCouponTemplateCountDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryCouponTemplateCountDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCouponTemplateCountDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCouponTemplateCountDetailResponse setBody(QueryCouponTemplateCountDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCouponTemplateCountDetailResponseBody getBody() {
        return this.body;
    }

}
