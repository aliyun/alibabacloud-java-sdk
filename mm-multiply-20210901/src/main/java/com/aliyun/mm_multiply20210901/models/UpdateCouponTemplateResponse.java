// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCouponTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCouponTemplateResponseBody body;

    public static UpdateCouponTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCouponTemplateResponse self = new UpdateCouponTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCouponTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCouponTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCouponTemplateResponse setBody(UpdateCouponTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCouponTemplateResponseBody getBody() {
        return this.body;
    }

}
