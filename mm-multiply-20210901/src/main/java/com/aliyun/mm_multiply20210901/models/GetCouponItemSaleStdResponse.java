// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetCouponItemSaleStdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCouponItemSaleStdResponseBody body;

    public static GetCouponItemSaleStdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCouponItemSaleStdResponse self = new GetCouponItemSaleStdResponse();
        return TeaModel.build(map, self);
    }

    public GetCouponItemSaleStdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCouponItemSaleStdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCouponItemSaleStdResponse setBody(GetCouponItemSaleStdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCouponItemSaleStdResponseBody getBody() {
        return this.body;
    }

}
