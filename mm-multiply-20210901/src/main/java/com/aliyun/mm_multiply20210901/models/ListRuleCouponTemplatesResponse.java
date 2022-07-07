// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListRuleCouponTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRuleCouponTemplatesResponseBody body;

    public static ListRuleCouponTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleCouponTemplatesResponse self = new ListRuleCouponTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleCouponTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleCouponTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuleCouponTemplatesResponse setBody(ListRuleCouponTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleCouponTemplatesResponseBody getBody() {
        return this.body;
    }

}
