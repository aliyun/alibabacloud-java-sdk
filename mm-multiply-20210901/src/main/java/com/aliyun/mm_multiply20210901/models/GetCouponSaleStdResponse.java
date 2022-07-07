// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetCouponSaleStdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCouponSaleStdResponseBody body;

    public static GetCouponSaleStdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCouponSaleStdResponse self = new GetCouponSaleStdResponse();
        return TeaModel.build(map, self);
    }

    public GetCouponSaleStdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCouponSaleStdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCouponSaleStdResponse setBody(GetCouponSaleStdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCouponSaleStdResponseBody getBody() {
        return this.body;
    }

}
