// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class DeleteCouponTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCouponTemplateResponseBody body;

    public static DeleteCouponTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCouponTemplateResponse self = new DeleteCouponTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCouponTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCouponTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCouponTemplateResponse setBody(DeleteCouponTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCouponTemplateResponseBody getBody() {
        return this.body;
    }

}
