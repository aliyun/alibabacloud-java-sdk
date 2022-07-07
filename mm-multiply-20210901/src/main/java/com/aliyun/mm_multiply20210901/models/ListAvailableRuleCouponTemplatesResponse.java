// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListAvailableRuleCouponTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableRuleCouponTemplatesResponseBody body;

    public static ListAvailableRuleCouponTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableRuleCouponTemplatesResponse self = new ListAvailableRuleCouponTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableRuleCouponTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableRuleCouponTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableRuleCouponTemplatesResponse setBody(ListAvailableRuleCouponTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableRuleCouponTemplatesResponseBody getBody() {
        return this.body;
    }

}
