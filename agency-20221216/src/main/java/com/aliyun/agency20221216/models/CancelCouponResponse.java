// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CancelCouponResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCouponResponseBody body;

    public static CancelCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCouponResponse self = new CancelCouponResponse();
        return TeaModel.build(map, self);
    }

    public CancelCouponResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCouponResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCouponResponse setBody(CancelCouponResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCouponResponseBody getBody() {
        return this.body;
    }

}
