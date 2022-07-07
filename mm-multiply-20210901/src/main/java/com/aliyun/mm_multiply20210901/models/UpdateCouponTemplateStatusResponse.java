// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCouponTemplateStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCouponTemplateStatusResponseBody body;

    public static UpdateCouponTemplateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCouponTemplateStatusResponse self = new UpdateCouponTemplateStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCouponTemplateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCouponTemplateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCouponTemplateStatusResponse setBody(UpdateCouponTemplateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCouponTemplateStatusResponseBody getBody() {
        return this.body;
    }

}
