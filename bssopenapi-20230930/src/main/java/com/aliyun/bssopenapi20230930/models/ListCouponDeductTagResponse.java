// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListCouponDeductTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCouponDeductTagResponseBody body;

    public static ListCouponDeductTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCouponDeductTagResponse self = new ListCouponDeductTagResponse();
        return TeaModel.build(map, self);
    }

    public ListCouponDeductTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCouponDeductTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCouponDeductTagResponse setBody(ListCouponDeductTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCouponDeductTagResponseBody getBody() {
        return this.body;
    }

}
