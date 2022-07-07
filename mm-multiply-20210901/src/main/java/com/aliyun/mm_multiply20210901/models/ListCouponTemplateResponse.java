// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListCouponTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCouponTemplateResponseBody body;

    public static ListCouponTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCouponTemplateResponse self = new ListCouponTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListCouponTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCouponTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCouponTemplateResponse setBody(ListCouponTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCouponTemplateResponseBody getBody() {
        return this.body;
    }

}
